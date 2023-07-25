package com.analytics.repository;

import com.analytics.entity.CarModelAnalyticsEntity;
import com.analytics.entity.CarModelPriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarPriceAnalyticsRepository extends JpaRepository<CarModelPriceEntity, Long> {
    Optional<CarModelAnalyticsEntity> findByModel(String model);
}
