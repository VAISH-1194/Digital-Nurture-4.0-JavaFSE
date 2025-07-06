package com.cognizant.ormlearn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.Model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String>
{

}