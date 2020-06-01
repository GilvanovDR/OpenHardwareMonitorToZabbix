/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.services;

public class OpenHWGetter extends Thread {
    Service service;

    public OpenHWGetter(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        while (!interrupted()) {
            System.out.println(this.getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
