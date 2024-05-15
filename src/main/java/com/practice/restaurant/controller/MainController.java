package com.practice.restaurant.controller;

import com.practice.restaurant.model.Review;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/main")
    public String main(Model model) {
        List<Review> feedbacks = new ArrayList<>();
        feedbacks.add(new Review("Алексей", "Восхитительно"));
        feedbacks.add(new Review("Наталья", "Однозначно рекомендую"));
        feedbacks.add(new Review("Сергей", "Отличный сервис"));
        feedbacks.add(new Review("Максим", "Было очень вкусно"));
        model.addAttribute("reviews", feedbacks);
        return "mainPage";
    }
}
