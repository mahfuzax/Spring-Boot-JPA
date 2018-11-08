package info.mahfuz.jpa.service.impl;

import info.mahfuz.jpa.model.Patient;
import info.mahfuz.jpa.model.SearchCriteria;
import info.mahfuz.jpa.repo.PatientRepository;
import info.mahfuz.jpa.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl extends BaseServiceImpl<Patient, Integer, PatientRepository> implements PatientService {
}
