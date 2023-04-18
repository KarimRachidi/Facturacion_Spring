package com.eoi.Facturacion_Spring.repositories;

import com.eoi.Facturacion_Spring.entities.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long>{
}
