package com.sourabh.vendorapp.Repos;

import com.sourabh.vendorapp.Entities.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {
}
