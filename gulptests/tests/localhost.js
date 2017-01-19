var domain = "http://localhost:80/index.html";    
 
this.devices = {
  desktop: {
    name: "desktop",
    size: "1024x768"
  },
  mobile: {
    name: "mobile",
    size: "700x1000"
  }
};

forAll(devices, function (device) {
  test("Home page on ${name}", function (device){
    var driver = createDriver(domain, device.size);
    checkLayout(driver, "specs/localhost.gspec", [device.name]);
    driver.quit();
  });
});
