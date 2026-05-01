package com.example.myapplication;

public final class EtaCalculator {

    private EtaCalculator() {
    }

    public static int estimateMinutes(double distanceKm, double avgSpeedKmH, double trafficFactor) {
        if (distanceKm <= 0) {
            throw new IllegalArgumentException("La distancia debe ser mayor a 0");
        }
        if (avgSpeedKmH <= 0) {
            throw new IllegalArgumentException("La velocidad debe ser mayor a 0");
        }
        if (trafficFactor <= 0) {
            throw new IllegalArgumentException("El factor de trafico debe ser mayor a 0");
        }

        double hours = distanceKm / avgSpeedKmH;
        return (int) Math.ceil(hours * 60 * trafficFactor);
    }
}

