<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description>Ensure if seller has been deleted product, the product will be deleted also on other devices with same account</description>
   <name>TCI-LM053</name>
   <tag></tag>
   <executionMode>SEQUENTIAL</executionMode>
   <maxConcurrentInstances>8</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Mobile</groupName>
            <profileName>Staging</profileName>
            <runConfigurationData>
               <entry>
                  <key>deviceName</key>
                  <value>iPhone Developer’s iPhone 12.1.1</value>
               </entry>
               <entry>
                  <key>deviceId</key>
                  <value>8e8e155b59f5b19f0a4975c800f2253f3d791328</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>iOS</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Apps Seller/Listing Management/TCI-LM053/TCI-LM053a</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Mobile</groupName>
            <profileName>Staging</profileName>
            <runConfigurationData>
               <entry>
                  <key>deviceName</key>
                  <value>iPhone vhl22’s iPhone 11.4.1</value>
               </entry>
               <entry>
                  <key>deviceId</key>
                  <value>7ff5b348bed2d454e969cf8a1cfdb84ccc89be82</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>iOS</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Apps Seller/Listing Management/TCI-LM053/TCI-LM053b</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
