package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping
    public String skills() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Python</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";

        return html;
    }

    @PostMapping("form")
    public String displayUserSkills(@RequestParam String userName, @RequestParam String firstFavorite,
                                    @RequestParam String secondFavorite, @RequestParam String thirdFavorite) {

        String html =
                "<html>" +
                        "<body>" +
                        "<h1>" + userName + "</h1>" +
                        "<ol>" +
                        "<li>" + firstFavorite + "</li>" +
                        "<li>" + secondFavorite + "</li>" +
                        "<li>" + thirdFavorite + "</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";

        return html;
    }


    @GetMapping("form")
    public String form() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method='post' action='/form'>" +
                        "<label>Name: <br/> <input type='text' name='userName'/> </label> <br/> " +
                        "<label>My favorite language " + "<br/>" +
                        "<select name='firstFavorite'>" +
                        "<option value='java'>Java</option>" +
                        "<option value='javascript'>JavaScript</option>" +
                        "<option value='python'>Python</option>" +
                        "</select>" +
                        "</label> <br/>" +
                        "<label>My second favorite language " + "<br/>" +
                        "<select name='secondFavorite'>" +
                        "<option value='java'>Java</option>" +
                        "<option value='javascript'>JavaScript</option>" +
                        "<option value='python'>Python</option>" +
                        "</select>" +
                        "</label> <br/>" +
                        "<label>My third favorite language " + "<br/>" +
                        "<select name='thirdFavorite'>" +
                        "<option value='java'>Java</option>" +
                        "<option value='javascript'>JavaScript</option>" +
                        "<option value='python'>Python</option>" +
                        "</select>" +
                        "</label> <br/>" +
                        "<input type='submit' value='Submit'>" +
                        "</form>" +
                        "</body>" +
                        "</html>";

        return html;

    }

}
