/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR;

import fi.iki.elonen.NanoHTTPD;
import ru.GilvanovDR.services.Service;
import ru.GilvanovDR.web.NanoServer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Service service = new Service();
        NanoServer nanoServer = new NanoServer(8085, service);
        nanoServer.start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
    }
}
