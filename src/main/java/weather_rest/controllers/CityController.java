package weather_rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import weather_rest.service.CityService;
 
@SuppressWarnings("unused")
@Controller
public class CityController {
                
   @GetMapping("/cities/{city}")
   public String getCityInfo(@PathVariable("city") String cityName,Model model) {
      // TODO your code goes here
      return "";
   }
}

