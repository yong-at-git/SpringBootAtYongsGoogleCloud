package se.yong.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yong Huang <yong.e.huang@gmail.com> on 2017-11-12.
 */
@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

    @RequestMapping("/")
    public ResponseEntity<RootHelpResponse> getHelp() {
        RootHelpResponse response = new RootHelpResponse("See available APIs from /docs");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    class RootHelpResponse {
        private String message;

        public RootHelpResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
