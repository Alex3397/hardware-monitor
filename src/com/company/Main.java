package com.company;

import com.company.GUI.Components;
import com.company.GUI.MainFrame;
import com.company.GUI.MainPanel;
import com.sun.jna.platform.WindowUtils;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

import static java.awt.GraphicsDevice.WindowTranslucency.TRANSLUCENT;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        SystemInfo si = new SystemInfo();
        OperatingSystem os = si.getOperatingSystem();
        HardwareAbstractionLayer hal = si.getHardware();
        CentralProcessor cpu = hal.getProcessor();
        ComputerSystem cs = hal.getComputerSystem();

        System.out.println("Software Information:");
        System.out.println(os.getVersionInfo());
        System.out.println(os.getBitness());
        System.out.println(os.getFamily());
        System.out.println(os.getFileSystem());
        System.out.println(os.getManufacturer());
        System.out.println(os.getProcesses());
        System.out.println(os.getThreadCount());
        System.out.println(os.getProcess(0));
        System.out.println(os.getProcess(1));
        System.out.println(os.getDesktopWindows(true));
        System.out.println(os.getInternetProtocolStats());
        System.out.println(os.getNetworkParams());
        System.out.println(os.getProcessCount());
        System.out.println(os.getProcessId());
        System.out.println((Arrays.toString(os.getServices())));
        System.out.println(os.getSessions());
        System.out.println(os.getSystemBootTime());
        System.out.println(os.getSystemUptime());
        System.out.println(os.isElevated());

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
        System.out.println(cpu.getContextSwitches());

        System.out.println("Computer System");
        System.out.println(cs.getBaseboard());
        System.out.println(cs.getManufacturer());
        System.out.println(cs.getFirmware());
        System.out.println(cs.getSerialNumber());
        System.out.println(cs.getHardwareUUID());

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
                p.setOpaque(false);
            }
        });


    }

}
