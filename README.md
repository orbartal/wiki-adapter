AdapterWiki goal: to provide an API Gateway that will translate api and data model between different wiki software, and will enable any client and wiki tool to communicate, query and manage any wiki server. In order to increase collaboration and reduce duplication in the global wiki community. 

Repository structure:
1. Logic contain the swagger rest api documentation.
2. Server contains servers that implaments this api. E.g. a middel layer that translate api calls from AdapterWiki Rest api and data model into other wiki servers api.
3. Client contains applications and libraries that communicate with a wiki server that support AdapterWiki Rest api. Either directly by implement it. Or Indirectly by using another server as an adapter that translate api calls from AdapterWiki Rest api and data model into the wiki servers api.

See also:
http://www.opensym.org/ws2005/proceedings/paper-06.pdf

The 3 layers architecture of wiki adapter:
https://en.wikipedia.org/wiki/File:Overview_of_a_three-tier_application_vectorVersion.svg
The wiki client that send requst to the AdapterWiki server is the application layer.
The AdapterWiki server, that implement the AdapterWiki Rest api, is the logic layer.
And the wiki server, that the AdapterWiki server forward the request to, is the data layer. 
