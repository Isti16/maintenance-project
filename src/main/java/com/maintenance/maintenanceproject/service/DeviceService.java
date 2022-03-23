package com.maintenance.maintenanceproject.service;

import java.util.List;

import com.maintenance.maintenanceproject.model.Device;


public class DeviceService {
    public List<Device> getDevices() {
        return List.of(
            new Device(
                id:1,
                name:"Demo",
                location:"place",
                category:"category"
            )
        );
    }
}
