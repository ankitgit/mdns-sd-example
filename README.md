# mdns-sd-example
This is an example project for publishing a sample service on mdns server

# How to use
Install avahi mdns server on your local machine. If on Ubuntu try following commands:

```sudo apt-get install avahi-daemon```

```sudo service avahi-daemon start```

This will start the mdns service on local system.

Use following command to listen on the server for any service that are getting announced:

```avahi-browse -a ```

Now execute the main class and you will find following output on the console:

```jshelllanguage
echo@dot:~/workspace/mdns-sd-example$ avahi-browse -a
+ enp0s3 IPv4 ankit                                         Web Site             local
- enp0s3 IPv4 ankit                                         Web Site             local

```

