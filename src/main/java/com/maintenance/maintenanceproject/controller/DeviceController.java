package com.maintenance.maintenanceproject.controller;

import java.util.List;

import com.maintenance.maintenanceproject.model.Device;
import com.maintenance.maintenanceproject.service.DeviceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeviceController {
    
    private DeviceService deviceService;

    @Autowired
    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/devices")
    public List<Device> getDevices() {
        return deviceService.getDevices();
    }
}
