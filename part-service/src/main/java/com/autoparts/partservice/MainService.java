package com.autoparts.partservice;

import com.autoparts.partservice.dao.ModelDAO;
import com.autoparts.partservice.dao.PartDAO;
import com.autoparts.partservice.dao.ReplaceDAO;
import com.autoparts.partservice.model.Part;
import com.autoparts.partservice.repository.ModelRepository;
import com.autoparts.partservice.repository.PartRepository;
import com.autoparts.partservice.repository.ReplaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MainService {
    @Autowired
    private PartRepository partRepository;
    @Autowired
    private ModelRepository modelRepository;
    @Autowired
    private ReplaceRepository replaceRepository;

    public List<Part> all() {
        Iterable<PartDAO> partsDao = partRepository.findAll();
        List<Part> response = new ArrayList<>();
        for (PartDAO partDao : partsDao) {
            Part p = new Part(
                    partDao.getType().getTitle(),
                    partDao.getModel().getTitle(),
                    partDao.getSupplier().getTitle(),
                    partDao.getPrice()
            );
            response.add(p);
        }
        return response;
    }

    public List<Part> search(String model) {
        List<ModelDAO> modelsDao = modelRepository.findByTitleContainsIgnoreCase(model);

        List<Part> response = new ArrayList<>();
        for (ModelDAO modelDAO : modelsDao) {
            List<PartDAO> partsDAO = partRepository.findByModel_Id(modelDAO.getId());
            for (PartDAO partDAO : partsDAO) {
                Part p = new Part(
                        partDAO.getType().getTitle(),
                        partDAO.getModel().getTitle(),
                        partDAO.getSupplier().getTitle(),
                        partDAO.getPrice()
                );
                response.add(p);
            }
        }
        return response;
    }


    public Part part(Long id) {
        Optional<PartDAO> partDAO = partRepository.findById(id);

        Part p = null;
        if (partDAO.isPresent()) {
            p = new Part(
                    partDAO.get().getType().getTitle(),
                    partDAO.get().getModel().getTitle(),
                    partDAO.get().getSupplier().getTitle(),
                    partDAO.get().getPrice()
            );
        }

        return p;
    }


    public List<Part> replace(Long id) {
        List<ReplaceDAO> replacesDAO = replaceRepository.findByOriginId(id);

        List<Part> response = new ArrayList<>();
        for (ReplaceDAO replaceDAO : replacesDAO) {
            Part p = part(replaceDAO.getReplaceId());
            response.add(p);
        }
        return response;
    }
}
