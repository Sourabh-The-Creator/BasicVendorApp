package com.sourabh.vendorapp.Controllers;

import com.sourabh.vendorapp.Entities.Vendor;
import com.sourabh.vendorapp.Service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class VendorController {

    @Autowired
    VendorService service;

    @RequestMapping("/showCreate")
    public String showCreate(){
        return "createVendor";
    }

    @RequestMapping("saveVendor")
    public String saveVendor(@ModelAttribute("location") Vendor vendor, ModelMap modelMap){
        Vendor vendorSaved = service.saveVendor(vendor);
        String msg = "Vendor saved with id: " + vendor.getId();
        modelMap.addAttribute("msg", msg);
        return "createVendor";
    }

    @RequestMapping("displayVendors")
    public String displayLocations(ModelMap modelMap){
        List<Vendor> vendors = service.getAllVedors();
        modelMap.addAttribute("vendors",vendors );
        return "displayVendors";
    }

    @RequestMapping("showUpdate")
    public String showUpdate(@RequestParam("id") int id, ModelMap modelMap){

        Vendor vendor = service.getVendorById(id);
        modelMap.addAttribute("vendor",vendor );
        return "updateVendor";
    }

    @RequestMapping("updateVendor")
    public String updateVendor(@ModelAttribute("vendor") Vendor vendorValue, ModelMap modelMap){
        service.updateVendor(vendorValue);
        List<Vendor> vendors = service.getAllVedors();
        modelMap.addAttribute("vendors",vendors );
        return "displayVendors";
    }

    @RequestMapping("/deleteVendor")
    public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
       Vendor vendor = service.getVendorById(id);
        service.deleteVendor(vendor);
        List<Vendor> vendors = service.getAllVedors();
        modelMap.addAttribute("vendors", vendors);
        return "displayVendors";
    }






}

