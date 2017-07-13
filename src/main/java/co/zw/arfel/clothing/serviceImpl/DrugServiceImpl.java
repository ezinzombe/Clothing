package co.zw.arfel.clothing.serviceImpl;


import co.zw.arfel.clothing.repository.DrugRepository;
import co.zw.arfel.clothing.service.DrugService;
import co.zw.arfel.clothing.model.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DrugServiceImpl implements DrugService {
    @Autowired
    DrugRepository drugRepository;




    @Override
    public Drug save(Drug drug) {
        return drugRepository.save(drug);
    }

    @Override
    public Optional<Drug> findOne(Long id) {
        return Optional.ofNullable(drugRepository.findOne(id));
    }

    @Override
    public Optional<List<Drug>> findAll() {
        return Optional.ofNullable((List<Drug>) drugRepository.findAll());
    }

    @Override
    public void delete(Long id) {
       drugRepository.delete(id);

    }

    @Override
    public Boolean checkDuplicate(Drug drug) {
        return null;
    }
}
