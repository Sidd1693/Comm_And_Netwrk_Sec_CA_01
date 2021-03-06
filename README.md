# Application for secure email exchange: encryption-decryption with AES in ECB mode

## Running the Application

There are two ways to run the application : using `mvn spring-boot:run` or by running the `Application` class directly from your IDE.

Below are the configuration details to start the project using a `spring-boot:run` command. Both Eclipse and Intellij IDEA are covered.

#### Eclipse

- Right click on a project folder and select `Run As` --> `Maven build..` . After that a configuration window is opened.
- In the window set the value of the **Goals** field to `spring-boot:run`
- You can optionally select `Skip tests` checkbox
- All the other settings can be left to default

Once configurations are set clicking `Run` will start the application

#### Intellij IDEA

- On the right side of the window, select Maven --> Plugins--> `spring-boot` --> `spring-boot:run` goal
- Optionally, you can disable tests by clicking on a `Skip Tests mode` blue button.

Clicking on the green run button will start the application.

After the application has started, you can view your it at http://localhost:9999/ in your browser.

(You can change the port from `application.properties` under `src/main/resources`. ( i.e. `src/main/resources/application.properties`)

If you want to run the application locally in the production mode, use `spring-boot:run -Pproduction` command instead.


## Notes

If you run application from a command line, remember to prepend a `mvn` to the command.