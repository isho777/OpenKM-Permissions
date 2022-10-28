# OpenKM-Permissions

Demonstrates OpenKM document Management System Permissions class: com.openkm.sdk4j.bean.Permission

Prints the available Permsission codes that can be used to assign a resources (nodeId) such as a file or folder to a user, via api connection to  OpenKM system

1=read,  2 = write,   3=read+write,  4=delete,  15=ALL, 16=move, 1024=download, 0=none, etc

Via postman example:

Method: PUT
URL: http://<server_address>:8080/OpenKM/services/rest/auth/grantUser?
Auth: Basic Authentication
Headers: Content-Type: application/x-www-form-urlencoded
Body:
      NodeId:     c10298e0-1007-4956-950a-2338b0a04ac4
      user:       user1
      permissions:3
      recursive:  true




