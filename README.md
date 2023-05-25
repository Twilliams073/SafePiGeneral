# SafePiGeneral

Required dependencies: JDK 17, node.js, and npm

Frontend may require node_modules to be added to the root folder (folder containing package.json)

Starting Commands:

Backend:
@ directory with pom.xml file, use command: mvn spring-boot:run

Frontend:
@ directory with package.json, use command: npm start

# Raspberry Pi Setup

- Install safepi.py on Raspberry Pi
- Attach a reed switch to GPIO pin 26 and another to GPIO pin 16
- Attach a buzzer to GPIO pin 17
- Replace put requests in safepi.py on lines: 38, 45, and 59 and 66 to point to your server's IP and Port

# TODO
- Upload the code for the PIR sensor
- Test and calibrate PIR sensor
- Add Camera to Raspberry Pi
