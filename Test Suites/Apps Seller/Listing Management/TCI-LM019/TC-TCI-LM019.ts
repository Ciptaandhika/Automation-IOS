<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description>1. Seller click button 'Turunkan Produk' for selected product
2. Seller login with same account in other device
3. Seller access menu Listing Management-Produk Tersimpan</description>
   <name>TC-TCI-LM019</name>
   <tag></tag>
   <executionMode>SEQUENTIAL</executionMode>
   <maxConcurrentInstances>8</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Mobile</groupName>
            <profileName>default</profileName>
            <runConfigurationData>
               <entry>
                  <key>deviceName</key>
                  <value>iPhone iPhone 12.1</value>
               </entry>
               <entry>
                  <key>deviceId</key>
                  <value>518d9f955074211db95ad490b9d0cfee1139f057</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>iOS</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Apps Seller/Listing Management/TCI-LM019/TCI-LM019a</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Mobile</groupName>
            <profileName>default</profileName>
            <runConfigurationId>iOS</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Apps Seller/Listing Management/TCI-LM019/TCI-LM019b</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
