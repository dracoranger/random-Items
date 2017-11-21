#pythonSockets
#By DracoRanger
#!/usr/bin/python
import socket

target= "CS484.eecs.net"
port="8081"

with socket.socket(socket.AF_INET,socket.SOCK_STREAM) as s:
    family,socketType,proto, canon, (ip,portAct)=sock.getaddrinfo(target,port)

    get="Host:"+str(target)+"\n\r"+"User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:54.0) Gecko/20100101 Firefox/54.0.1 Waterfox/54.0.1\n\rAccept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\n\rAccept-Language: en-US,en;q=0.5\n\rAccept-Encoding: gzip, deflate, br\n\rReferer: https://www.google.com/\n\rDNT: 1\n\rConnection: keep-alive\n\rUpgrade-Insecure-Requests: 1\n\rIf-Modified-Since: Wed, 13 Sep 2017 02:23:19 GMT\n\rIf-None-Match: \"59b89697-2e1d9\"\n\rCache-Control: max-age=0"

    sock.bind(ip,portAct)
    sock.sendall(get)
