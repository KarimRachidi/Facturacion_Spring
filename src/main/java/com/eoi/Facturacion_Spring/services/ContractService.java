package com.eoi.Facturacion_Spring.services;




import com.eoi.Facturacion_Spring.entities.Contract;
import com.eoi.Facturacion_Spring.repositories.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;

import java.util.Optional;



@Service
public class ContractService {
    @Autowired
    private ContractRepository contractRepository;public List<Contract> findAll() {
        return contractRepository.findAll();

    }
    public Optional<Contract> findById(Long id) {
        return contractRepository.findById(id);

    }
    public Contract save(Contract contract) {
        return contractRepository.save(contract);

    }

    public void deleteById(Long id) {
        contractRepository.deleteById(id);

    }

}