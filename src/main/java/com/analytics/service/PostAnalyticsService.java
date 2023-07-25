package com.analytics.service;

import com.analytics.dto.CarPostDTO;
import org.springframework.stereotype.Service;

@Service
public interface PostAnalyticsService {
    void saveDataAnalytics(CarPostDTO carPostDTO);
}
