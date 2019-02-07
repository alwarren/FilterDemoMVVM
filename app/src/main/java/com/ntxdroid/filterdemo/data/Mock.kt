package com.ntxdroid.filterdemo.data

import com.ntxdroid.filterdemo.feature.mission.Mission

/**
 * Created by Al Warren on 2/6/2019.
 */

object Mock {
    val missions = listOf(
        Mission(
            0,
            "Thaicom",
            "9D1B7E0",
            listOf("Orbital ATK"),
            listOf("Thaicom 6", "Thaicom 8"),
            "https://en.wikipedia.org/wiki/Thaicom",
            "http://www.thaicom.net/en/satellites/overview",
            "https://twitter.com/thaicomplc",
            "Thaicom is the name of a series of communications satellites operated from Thailand, and also the name of Thaicom Public Company Limited, which is the company that owns and operates the Thaicom satellite fleet and other telecommunication businesses in Thailand and throughout the Asia-Pacific region. The satellite projects were named Thaicom by the King of Thailand, His Majesty the King Bhumibol Adulyadej, as a symbol of the linkage between Thailand and modern communications technology."
        ),
        Mission(
            1,
            "Telstar",
            "F4F83DE",
            listOf("SSL"),
            listOf("Telstar 19V", "Telstar 18V"),
            "https://en.wikipedia.org/wiki/Telesat",
            "https://www.telesat.com/",
            null,
            "Telstar 19V (Telstar 19 Vantage) is a communication satellite in the Telstar series of the Canadian satellite communications company Telesat. It was built by Space Systems Loral (MAXAR) and is based on the SSL-1300 bus. As of 26 July 2018, Telstar 19V is the heaviest commercial communications satellite ever launched, weighing at 7,076 kg (15,600 lbs) and surpassing the previous record, set by TerreStar-1 (6,910 kg/15230lbs), launched by Ariane 5ECA on 1 July 2009."
        ),
        Mission(
            0,
            "Iridium NEXT",
            "F3364BF",
            listOf("Orbital ATK"),
            listOf(
                "Iridium NEXT 1",
                "Iridium NEXT 2",
                "Iridium NEXT 3",
                "Iridium NEXT 4",
                "Iridium NEXT 5",
                "Iridium NEXT 6",
                "Iridium NEXT 7",
                "Iridium NEXT 8"
            ),
            "https://en.wikipedia.org/wiki/Iridium_satellite_constellation",
            "https://www.iridiumnext.com/",
            "https://twitter.com/IridiumBoss?lang=en",
            "In 2017, Iridium began launching Iridium NEXT, a second-generation worldwide network of telecommunications satellites, consisting of 66 active satellites, with another nine in-orbit spares and six on-ground spares. These satellites will incorporate features such as data transmission that were not emphasized in the original design. The constellation will provide L-band data speeds of up to 128 kbit/s to mobile terminals, up to 1.5 Mbit/s to Iridium Pilot marine terminals, and high-speed Ka-band service of up to 8 Mbit/s to fixed/transportable terminals. The next-generation terminals and service are expected to be commercially available by the end of 2018. However, Iridium's proposed use of its next-generation satellites has raised concerns the service will harmfully interfere with GPS devices. The satellites will incorporate a secondary payload for Aireon, a space-qualified ADS-B data receiver. This is for use by air traffic control and, via FlightAware, for use by airlines. A tertiary payload on 58 satellites is a marine AIS ship-tracker receiver, for Canadian company exactEarth Ltd. Iridium can also be used to provide a data link to other satellites in space, enabling command and control of other space assets regardless of the position of ground stations and gateways."
        ),
        Mission(
            1,
            "Commercial Resupply Services",
            "EE86F74",
            listOf("SpaceX"),
            listOf(
                "Dragon Qualification Unit",
                "COTS Demo Flight 1",
                "COTS Demo Flight 2",
                "SpaceX CRS-1",
                "SpaceX CRS-2",
                "SpaceX CRS-3",
                "SpaceX CRS-4",
                "SpaceX CRS-5",
                "SpaceX CRS-6",
                "SpaceX CRS-7",
                "SpaceX CRS-8",
                "SpaceX CRS-9",
                "SpaceX CRS-10",
                "SpaceX CRS-11",
                "SpaceX CRS-12",
                "SpaceX CRS-13",
                "SpaceX CRS-14",
                "SpaceX CRS-15"
            ),
            "https://en.wikipedia.org/wiki/Commercial_Resupply_Services#SpaceX",
            "https://www.spacex.com/",
            "https://twitter.com/SpaceX",
            "Commercial Resupply Services (CRS) are a series of contracts awarded by NASA from 2008–2016 for delivery of cargo and supplies to the International Space Station (ISS) on commercially operated spacecraft. The first CRS contracts were signed in 2008 and awarded $1.6 billion to SpaceX for 12 cargo transport missions and $1.9 billion to Orbital Sciences for 8 missions, covering deliveries to 2016. In 2015, NASA extended the Phase 1 contracts by ordering an additional three resupply flights from SpaceX and one from Orbital Sciences. After additional extensions late in 2015, SpaceX is currently scheduled to have a total of 20 missions and Orbital 10. SpaceX began flying resupply missions in 2012, using Dragon cargo spacecraft launched on Falcon 9 rockets from Space Launch Complex 40 at Cape Canaveral Air Force Station, Cape Canaveral, Florida. Orbital Sciences began deliveries in 2013 using Cygnus spacecraft launched on the Antares rocket from Launch Pad 0A at the Mid-Atlantic Regional Spaceport (MARS), Wallops Island, Virginia. A second phase of contracts (known as CRS2) were solicited and proposed in 2014. They were awarded in January 2016 to Orbital ATK, Sierra Nevada Corporation, and SpaceX, for cargo transport flights beginning in 2019 and expected to last through 2024."
        ),
        Mission(
            0,
            "SES",
            "6C42550",
            listOf("Orbital ATK, Boeing, Airbus Defence and Space"),
            listOf("SES-8", "SES-9", "SES-10", "SES-11", "SES-16", "SES-12"),
            "https://en.wikipedia.org/wiki/SES_S.A.",
            "https://www.ses.com/",
            "https://twitter.com/SES_Satellites",
            "SES S.A. is a communications satellite owner and operator providing video and data connectivity worldwide to broadcasters, content and internet service providers, mobile and fixed network operators, governments and institutions, with a mission to “connect, enable, and enrich”. SES operates more than 50 geostationary orbit satellites and 16 medium Earth orbit satellites. These comprise the well-known European Astra TV satellites, the O3b data satellites and others with names including AMC, Ciel, NSS, Quetzsat, YahSat and SES."
        ),
        Mission(
            1,
            "JCSAT",
            "FE3533D",
            listOf("SSL"),
            listOf("JCSAT-2B", "JCSAT-16"),
            "https://en.wikipedia.org/wiki/JSAT_Corporation",
            "https://www.jsat.net/en/",
            null,
            "The JSAT constellation is a communication and broadcasting satellite constellation formerly operated by JSAT Corporation and currently by SKY Perfect JSAT Group. It has become the most important commercial constellation in Japan, and the fifth of the world. It has practically amalgamated all private satellite operators in Japan, with only B-SAT left as a local competitor."
        ),
        Mission(
            0,
            "AsiaSat",
            "593B499",
            listOf("SSL"),
            listOf("AsiaSat 8", "AsiaSat 6"),
            "https://en.wikipedia.org/wiki/AsiaSat",
            "https://www.asiasat.com/",
            "https://twitter.com/asia_satellite",
            "Asia Satellite Telecommunications Holdings Limited known as its brand name AsiaSat is a commercial operator of communication spacecraft. AsiaSat is based in Hong Kong but incorporated in Bermuda."
        ),
        Mission(
            1,
            "Orbcomm OG2",
            "CE91D46",
            listOf("Sierra Nevada Corporation"),
            listOf("Orbcomm-OG2", "Orbcomm-OG2-M1", "Orbcomm-OG2-M2"),
            "https://en.wikipedia.org/wiki/Orbcomm_(satellite)#Orbcomm-OG2",
            "https://www.orbcomm.com/",
            "https://twitter.com/orbcomm_inc",
            "Orbcomm Generation 2 (OG2) second-generation satellites are intended to supplement and eventually replace the current first generation constellation. Eighteen satellites were ordered by 2008—nominally intended to be launched in three groups of six during 2010–2014—and by 2015 have all been launched, on three flights. Orbcomm has options for a further thirty OG2 spacecraft. The satellites were launched by SpaceX on the Falcon 9 launch system. Originally, they were to launch on the smaller Falcon 1e rocket."
        ),
        Mission(
            0,
            "ABS",
            "2CF444A",
            listOf("Boeing"),
            listOf("ABS-3A", "ABS-3B"),
            "https://en.wikipedia.org/wiki/ABS_(satellite_operator)",
            "http://www.absatellite.com/",
            null,
            "ABS, formerly Asia Broadcast Satellite, is a global satellite operator based in Hong Kong and officially incorporated in Bermuda. Its services include direct-to-home and satellite-to-cable TV distribution, cellular services, and internet services. Operating 6 communication satellites, the satellite fleet currently covers 93% of the world’s population including the Americas, Africa, Asia Pacific, Europe, the Middle East, Russia and Commonwealth of Independent States."
        ),
        Mission(
            1,
            "Eutelsat",
            "F7709F2",
            listOf("Boeing"),
            listOf("Eutelsat 115 West B", "Eutelsat 117 West B"),
            "https://en.wikipedia.org/wiki/Eutelsat",
            "https://www.eutelsat.com/en/home.html#",
            "https://twitter.com/Eutelsat_SA?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor",
            "Eutelsat S.A. is a European satellite operator. Providing coverage over the entire European continent, the Middle East, Africa, Asia and the Americas, it is the world's third largest satellite operator in terms of revenues."
        )
    )

}