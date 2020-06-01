/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.web;

import fi.iki.elonen.NanoHTTPD;
import org.apache.log4j.Logger;
import ru.GilvanovDR.services.Service;
import ru.GilvanovDR.utils.IPUtil;

import java.util.StringTokenizer;

public class NanoServer extends NanoHTTPD {
    Service service;
    private static final Logger log = Logger.getLogger(NanoServer.class);


    public NanoServer(int port, Service service) {
        super(port);
        this.service = service;
    }

    public Response serve(IHTTPSession session) {
        String ip;
        StringTokenizer st = new StringTokenizer(session.getUri(), "/");
        if (st.hasMoreTokens() && !"favicon.ico".equals(ip = st.nextToken()) && IPUtil.ipValidate(ip)) {
            log.info("GET " + session.getUri());
            return newFixedLengthResponse(String.valueOf(service.getJson(ip)));
        }
        log.debug("GET(BAD_REQUEST) " + session.getUri());
        return newFixedLengthResponse("BAD_REQUEST");
    }

}
