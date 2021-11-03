package com.example.solarsystem.repository

import com.example.solarsystem.R
import com.example.solarsystem.model.Orb

object SolarSystemRepository {

    fun findAll(): List<Orb>{
        return listOf(
            Orb(1, "Sun", "Star", R.drawable.sun, "274.0 m/s²", "1.9891 * 10^30 kg", "1.412 * 10^18 km³", "1.408 * 10^3 km/m³", "6.0877 * 10^12 km²"),
            Orb(2, "Mercury", "Telluric planet", R.drawable.mercury, "3.7 m/s²", "3.3011 * 10^23 kg", "6.083 * 10^10 km³", "5.427 g/cm³", "7.48 * 10^7 km²"),
            Orb(3, "Venus", "Telluric planet", R.drawable.venus, "8.87 m/s²", "4.8685 * 10^24 kg", "92.843 * 10^10 km³", "5.243 g/cm³", "4.60 * 10^8 km²"),
            Orb(4, "Earth", "Telluric planet", R.drawable.earth, "9.780327 m/s²", "5.9736 * 10^24 kg", "1.08321 * 10^12 km³", "5.515 g/cm³", "5.10 * 10^8 km²"),
            Orb(5, "Mars", "Telluric planet", R.drawable.mars, "3.711 m/s²", "6.4174 * 10^23 kg", "1.6318 * 10^11 km³", "3.933 g/cm³", "1.44 * 10^8 km²"),
            Orb(6, "Jupiter", "Giant planet", R.drawable.jupiter, "24.79 m/s²", "1.8986 * 10^27 kg", "1.43128 * 10^15 km³", "1.326 g/cm³", "6.21796 * 10^10 km²"),
            Orb(7, "Saturn", "Giant planet", R.drawable.saturn, "10.44 m/s²", "5.6846 * 10^26 kg", "8.2713 * 10^14 km³", "0.687 g/cm³", "4.27 * 10^10 km²"),
            Orb(8, "Uranus", "Giant planet", R.drawable.uranus, "8.69 m/s²", "(8.6810 ± 0.0013) * 10^25 kg", "6.833 * 10^13 km³", "1.27 g/cm³", "8,115 * 10^9 km²"),
            Orb(9, "Neptune", "Giant planet", R.drawable.neptune, "11.15 m/s²", "1.0243 * 10^26 kg", "6.254 * 10^13 km³", "1.638 g/cm³", "7.6183 * 10^9 km²"),
            Orb(10, "Pluto", "Dwarf planet", R.drawable.pluto, "0.658 m/s²", "(1.305 ± 0.007) * 10^22 kg", "6.39 * 10^9 km³", "2.03 ± 0.06 g/cm³", "1.665 * 107 km²"),
            Orb(11, "Ceres", "Dwarf planet", R.drawable.ceres, "0.028 g", "9.5 * 10^20 kg", "-", "2.08 g/cm³", "1.8 * 10^6 km²")
        )
    }
}