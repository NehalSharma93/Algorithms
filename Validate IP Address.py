"""
Given a string IP, return "IPv4" if IP is a valid IPv4 address, "IPv6" if IP is a valid IPv6 address or "Neither" if IP is not a correct IP of any type.

A valid IPv4 address is an IP in the form "x1.x2.x3.x4" where 0 <= xi <= 255 and xi cannot contain leading zeros. 
For example, "192.168.1.1" and "192.168.1.0" are valid IPv4 addresses but "192.168.01.1", while "192.168.1.00" and "192.168@1.1" are invalid IPv4 addresses.

A valid IPv6 address is an IP in the form "x1:x2:x3:x4:x5:x6:x7:x8" where:

1 <= xi.length <= 4
xi is a hexadecimal string which may contain digits, lower-case English letter ('a' to 'f') and upper-case English letters ('A' to 'F').
Leading zeros are allowed in xi.
For example, "2001:0db8:85a3:0000:0000:8a2e:0370:7334" and "2001:db8:85a3:0:0:8A2E:0370:7334" are valid IPv6 addresses, 
while "2001:0db8:85a3::8A2E:037j:7334" and "02001:0db8:85a3:0000:0000:8a2e:0370:7334" are invalid IPv6 addressesclass Solution(object):
"""


  def validIPAddress(self, IP):
        """
        :type IP: str
        :rtype: str
        """
        octets = IP.split(".")
        flag = True
        if len(octets)==4:
            for o in octets:
                if(o==""):
                    flag = False
                    break
                for ch in o:
                    val = ord(ch)
                    if not ( (val>=48) and (val<=57)):
                        flag = False
                        break
                if flag==False:
                    break
                if ( (o[0]=='0') and (len(o)>1) ):
                    flag = False
                    break 
                octet = int(o)
                if ( (octet < 0) or (octet > 255) ):
                    flag = False
                    break
            if flag==True:
                return "IPv4"
        flag = True
        hextets = IP.split(":")
        if len(hextets)==8:
            for h in hextets:
                if ((len(h) < 1) or (len(h) > 4)):
                    flag = False
                    break
                for ch in h:
                    val = ord(ch)
                    # print(val)
                    if not ( ((val>=48) and (val<=57)) or ((val>=65) and (val<=70)) or ((val>=97) and (val<=102)) ):
                        flag = False
                        break
            if flag==True:
                return "IPv6"
        return "Neither"
            
        
            
                
                
        
