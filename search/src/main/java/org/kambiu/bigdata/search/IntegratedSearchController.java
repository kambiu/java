/**
 * Created by kambiu on 4/9/2017.
 */

package org.kambiu.bigdata.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Value;

@Controller
public class IntegratedSearchController {

    @Value("${elasticsearch.host}")
    String esHost;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("es_host", esHost);
        return "result";
    }

}
