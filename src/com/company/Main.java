package com.company;

import com.company.GUI.Components;
import com.company.GUI.MainFrame;
import com.company.GUI.MainPanel;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        SystemInfo si = new SystemInfo();
        OperatingSystem os = si.getOperatingSystem();
        HardwareAbstractionLayer hal = si.getHardware();
        CentralProcessor cpu = hal.getProcessor();
        ComputerSystem cs = hal.getComputerSystem();

        System.out.println("-------------------------------------------------");

        System.out.println("Software Information:");
        System.out.println("Version info: " + os.getVersionInfo());
        System.out.println("Bitness: " + os.getBitness());
        System.out.println("Family: " + os.getFamily());
        System.out.println("File System: " + os.getFileSystem());
        System.out.println("Manufacturer: " + os.getManufacturer());
        System.out.println("Processes: " + os.getProcesses());
        System.out.println("Thread count: " + os.getThreadCount());
        System.out.println("Process 1: " + os.getProcess(1));
        System.out.println("DesktopWindows: " + os.getDesktopWindows(false));
        System.out.println("Internet Protocol Stats: " + os.getInternetProtocolStats());
        System.out.println("Network Params: " + os.getNetworkParams());
        System.out.println("Process Count: " + os.getProcessCount());
        System.out.println("Process Id: " + os.getProcessId());
        System.out.println("Services: " + (Arrays.toString(os.getServices())));
        System.out.println("Sessions: " + os.getSessions());
        System.out.println("Boot time: " + os.getSystemBootTime());
        System.out.println("System Uptime: " + os.getSystemUptime());
        System.out.println("Is Elevated? " + os.isElevated());

        System.out.println("-------------------------------------------------");

        System.out.println("Hardware Information:");
        System.out.println(hal.getDisplays());
        System.out.println(hal.getProcessor());
        System.out.println(hal.getComputerSystem());
        System.out.println(hal.getGraphicsCards());
        System.out.println(hal.getDiskStores());
        System.out.println(hal.getUsbDevices(true));
        System.out.println(hal.getMemory());
        System.out.println(hal.getNetworkIFs());
        System.out.println(hal.getPowerSources());
        System.out.println(hal.getPowerSources());
        System.out.println(hal.getSoundCards());

        System.out.println("CPU Information:");
        System.out.println("Context Switches: " + cpu.getContextSwitches());
        System.out.println("Current Freq: " + Arrays.toString(cpu.getCurrentFreq()));
        System.out.println("Interrupts: " + cpu.getInterrupts());
        System.out.println("Logical Processor Count: " + cpu.getLogicalProcessorCount());
        System.out.println("Max Freq: " + cpu.getMaxFreq());
        System.out.println("Logical Processors: " + cpu.getLogicalProcessors());
        System.out.println("Physical Package Count: " + cpu.getPhysicalPackageCount());
        System.out.println("Physical Processor Count: " + cpu.getPhysicalProcessorCount());
        System.out.println("Processor CPU Load Ticks: " + Arrays.deepToString(cpu.getProcessorCpuLoadTicks()));
        System.out.println("Processor Identifier: " + cpu.getProcessorIdentifier());
        System.out.println("System Load Average: " + Arrays.toString(cpu.getSystemLoadAverage(1)));
        System.out.println("System CPU Load Ticks: " + Arrays.toString(cpu.getSystemCpuLoadTicks()));

        System.out.println("-------------------------------------------------");

        System.out.println("GPU information:");


        System.out.println("-------------------------------------------------");

        System.out.println("Computer System");
        System.out.println("Baseboard: " + cs.getBaseboard());
        System.out.println("Manufacturer: " + cs.getManufacturer());
        System.out.println("Firmware: " + cs.getFirmware());
        System.out.println("Serial Number: " + cs.getSerialNumber());
        System.out.println("HardwareUUID: " + cs.getHardwareUUID());

        System.out.println("-------------------------------------------------");

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mf = new MainFrame();
                MainPanel p = new MainPanel();
                mf.getContentPane().add(p);
                p.add(Components.LabelText("Label: "));
                p.add(Components.TextField("Text field"));
                p.add(Components.LabelText("Label: "));
                p.add(Components.TextField("Text field"));
                p.add(Components.LabelText("Label: "));
                p.add(Components.TextField("Text field"));
                p.add(Components.LabelText("Label: "));
                p.add(Components.TextField("Text field"));
                p.add(Components.LabelText("Label: "));
                p.add(Components.TextField("Text field"));
            }
        });


    }

}
