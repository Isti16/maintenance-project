package com.maintenance.maintenanceproject.controller;

import java.util.List;

import com.maintenance.maintenanceproject.model.Device;
import com.maintenance.maintenanceproject.service.DeviceService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {
    
    private DeviceService deviceService;

    @GetMapping()
    public List<Device> getDevices() {
        
    }
}
