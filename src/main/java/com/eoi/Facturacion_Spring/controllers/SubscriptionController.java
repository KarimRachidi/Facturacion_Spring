package com.eoi.Facturacion_Spring.controllers;





import com.eoi.Facturacion_Spring.entities.Subscription;
import com.eoi.Facturacion_Spring.services.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;



import java.util.List;

import java.util.Optional;



@Controller

@RequestMapping("/subscriptions")

public class SubscriptionController {



    @Autowired

    private SubscriptionService subscriptionService;



    @GetMapping("/")

    public String getAllSubscriptions(Model model) {

        List<Subscription> subscriptions = subscriptionService.findAll();

        model.addAttribute("subscriptions", subscriptions);

        return "subscription-list";

    }



    @GetMapping("/{id}")

    public String getSubscriptionById(@PathVariable Long id, Model model) {

        Optional subscription = subscriptionService.findById(id);

        model.addAttribute("subscription", subscription.get());

        return "subscription-form";

    }





    @GetMapping("/new")

    public String newSubscription(Model model) {

        Subscription subscription = new Subscription();

        model.addAttribute("subscription", subscription);

        return "subscription-form";

    }



    @PostMapping("/save")

    public String saveSubscription(Subscription subscription) {

        subscriptionService.save(subscription);

        return "redirect:/subscriptions/";

    }



    @GetMapping("/edit/{id}")

    public String editSubscription(@PathVariable Long id, Model model) {

        Optional subscription = subscriptionService.findById(id);

        model.addAttribute("subscription", subscription.get());

        return "subscription-form";

    }



    @PostMapping("/update/{id}")

    public String updateSubscription(@PathVariable Long id, Subscription subscription) {

        subscription.setId(id);

        subscriptionService.save(subscription);

        return "redirect:/subscriptions/";

    }



    @GetMapping("/delete/{id}")

    public String deleteSubscription(@PathVariable Long id) {

        subscriptionService.deleteById(id);

        return "redirect:/subscriptions/";

    }



}