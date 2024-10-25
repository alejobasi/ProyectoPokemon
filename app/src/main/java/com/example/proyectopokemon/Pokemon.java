package com.example.proyectopokemon;

import java.util.List;
import java.util.ArrayList;

public class Pokemon {
    private int id;
    private String nombre;
    private String tipo;
    private int ataque;
    private int ataqueEsp;
    private int defensa;
    private int defensaEsp;
    private int velocidad;
    private String foto;
    private int generacion;

    public Pokemon(int id, String nombre, String tipo, int ataque, int ataqueEsp, int defensa, int defensaEsp, int velocidad, int generacion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.ataqueEsp = ataqueEsp;
        this.defensa = defensa;
        this.defensaEsp = defensaEsp;
        this.velocidad = velocidad;
        this.foto = "p"+id+".png";
        this.generacion = generacion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaqueEsp() {
        return ataqueEsp;
    }

    public void setAtaqueEsp(int ataqueEsp) {
        this.ataqueEsp = ataqueEsp;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getDefensaEsp() {
        return defensaEsp;
    }

    public void setDefensaEsp(int defensaEsp) {
        this.defensaEsp = defensaEsp;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

    public class PokemonGenerator {
        public  List<Pokemon> generateFirstGenPokemon() {
            List<Pokemon> pokemonList = new ArrayList<>();

            // Pokémon de la primera generación
            pokemonList.add(new Pokemon(1, "Bulbasaur", "Planta/Veneno", 49, 65, 49, 65, 45, 1));
            pokemonList.add(new Pokemon(2, "Ivysaur", "Planta/Veneno", 62, 80, 63, 80, 60, 1));
            pokemonList.add(new Pokemon(3, "Venusaur", "Planta/Veneno", 82, 100, 83, 100, 80, 1));
            pokemonList.add(new Pokemon(4, "Charmander", "Fuego", 52, 60, 43, 50, 65, 1));
            pokemonList.add(new Pokemon(5, "Charmeleon", "Fuego", 64, 80, 58, 65, 80, 1));
            pokemonList.add(new Pokemon(6, "Charizard", "Fuego/Volador", 84, 109, 78, 85, 100, 1));
            pokemonList.add(new Pokemon(7, "Squirtle", "Agua", 48, 50, 65, 64, 43, 1));
            pokemonList.add(new Pokemon(8, "Wartortle", "Agua", 63, 65, 80, 80, 58, 1));
            pokemonList.add(new Pokemon(9, "Blastoise", "Agua", 83, 85, 100, 105, 78, 1));
            pokemonList.add(new Pokemon(10, "Caterpie", "Bicho", 30, 20, 35, 20, 45, 1));
            pokemonList.add(new Pokemon(11, "Metapod", "Bicho", 20, 25, 55, 25, 30, 1));
            pokemonList.add(new Pokemon(12, "Butterfree", "Bicho/Volador", 45, 80, 40, 80, 70, 1));
            pokemonList.add(new Pokemon(13, "Weedle", "Bicho/Veneno", 40, 35, 30, 20, 50, 1));
            pokemonList.add(new Pokemon(14, "Kakuna", "Bicho/Veneno", 45, 25, 50, 25, 35, 1));
            pokemonList.add(new Pokemon(15, "Beedrill", "Bicho/Veneno", 65, 50, 40, 80, 75, 1));
            pokemonList.add(new Pokemon(16, "Pidgey", "Normal/Volador", 40, 35, 30, 30, 56, 1));
            pokemonList.add(new Pokemon(17, "Pidgeotto", "Normal/Volador", 63, 60, 55, 50, 71, 1));
            pokemonList.add(new Pokemon(18, "Pidgeot", "Normal/Volador", 83, 80, 75, 70, 91, 1));
            pokemonList.add(new Pokemon(19, "Rattata", "Normal", 30, 25, 35, 35, 72, 1));
            pokemonList.add(new Pokemon(20, "Raticate", "Normal", 55, 50, 50, 50, 97, 1));
            pokemonList.add(new Pokemon(21, "Spearow", "Normal/Volador", 55, 40, 30, 30, 70, 1));
            pokemonList.add(new Pokemon(22, "Fearow", "Normal/Volador", 65, 61, 50, 50, 100, 1));
            pokemonList.add(new Pokemon(23, "Ekans", "Veneno", 60, 40, 41, 40, 55, 1));
            pokemonList.add(new Pokemon(24, "Arbok", "Veneno", 85, 65, 69, 65, 80, 1));
            pokemonList.add(new Pokemon(25, "Pikachu", "Eléctrico", 55, 40, 35, 50, 90, 1));
            pokemonList.add(new Pokemon(26, "Raichu", "Eléctrico", 90, 90, 55, 80, 110, 1));
            pokemonList.add(new Pokemon(27, "Sandshrew", "Tierra", 50, 75, 85, 55, 40, 1));
            pokemonList.add(new Pokemon(28, "Sandslash", "Tierra", 75, 100, 110, 65, 55, 1));
            pokemonList.add(new Pokemon(29, "Nidoran♀", "Veneno", 47, 40, 52, 40, 41, 1));
            pokemonList.add(new Pokemon(30, "Nidorina", "Veneno", 62, 55, 57, 55, 56, 1));
            pokemonList.add(new Pokemon(31, "Nidoqueen", "Veneno/Tierra", 90, 75, 87, 85, 76, 1));
            pokemonList.add(new Pokemon(32, "Nidoran♂", "Veneno", 46, 40, 50, 40, 50, 1));
            pokemonList.add(new Pokemon(33, "Nidorino", "Veneno", 57, 55, 40, 40, 65, 1));
            pokemonList.add(new Pokemon(34, "Nidoking", "Veneno/Tierra", 81, 92, 77, 75, 85, 1));
            pokemonList.add(new Pokemon(35, "Clefairy", "Hada", 70, 60, 55, 65, 35, 1));
            pokemonList.add(new Pokemon(36, "Clefable", "Hada", 95, 70, 73, 85, 60, 1));
            pokemonList.add(new Pokemon(37, "Vulpix", "Fuego", 38, 50, 40, 65, 65, 1));
            pokemonList.add(new Pokemon(38, "Ninetales", "Fuego", 76, 81, 75, 100, 100, 1));
            pokemonList.add(new Pokemon(39, "Jigglypuff", "Normal/Hada", 115, 45, 50, 50, 20, 1));
            pokemonList.add(new Pokemon(40, "Wigglytuff", "Normal/Hada", 90, 70, 75, 80, 45, 1));
            pokemonList.add(new Pokemon(41, "Zubat", "Veneno/Volador", 45, 40, 40, 30, 55, 1));
            pokemonList.add(new Pokemon(42, "Golbat", "Veneno/Volador", 75, 70, 65, 75, 90, 1));
            pokemonList.add(new Pokemon(43, "Oddish", "Planta/Veneno", 45, 75, 50, 65, 30, 1));
            pokemonList.add(new Pokemon(44, "Gloom", "Planta/Veneno", 60, 80, 55, 65, 40, 1));
            pokemonList.add(new Pokemon(45, "Vileplume", "Planta/Veneno", 75, 90, 65, 80, 50, 1));
            pokemonList.add(new Pokemon(46, "Paras", "Bicho/Planta", 35, 70, 55, 55, 25, 1));
            pokemonList.add(new Pokemon(47, "Parasect", "Bicho/Planta", 60, 95, 70, 80, 30, 1));
            pokemonList.add(new Pokemon(48, "Venonat", "Bicho/Veneno", 60, 55, 50, 55, 45, 1));
            pokemonList.add(new Pokemon(49, "Venomoth", "Bicho/Veneno", 70, 65, 60, 75, 90, 1));
            pokemonList.add(new Pokemon(50, "Diglett", "Tierra", 10, 55, 25, 35, 95, 1));
            pokemonList.add(new Pokemon(51, "Dugtrio", "Tierra", 35, 80, 50, 70, 120, 1));
            pokemonList.add(new Pokemon(52, "Meowth", "Normal", 45, 40, 35, 40, 90, 1));
            pokemonList.add(new Pokemon(53, "Persian", "Normal", 70, 65, 60, 65, 115, 1));
            pokemonList.add(new Pokemon(54, "Psyduck", "Agua", 52, 65, 55, 50, 55, 1));
            pokemonList.add(new Pokemon(55, "Golduck", "Agua", 80, 95, 80, 80, 85, 1));
            pokemonList.add(new Pokemon(56, "Poliwag", "Agua", 40, 40, 50, 40, 90, 1));
            pokemonList.add(new Pokemon(57, "Poliwhirl", "Agua", 65, 50, 50, 60, 70, 1));
            pokemonList.add(new Pokemon(58, "Poliwrath", "Agua/Lucha", 90, 85, 95, 70, 70, 1));
            pokemonList.add(new Pokemon(59, "Abra", "Psíquico", 20, 15, 15, 55, 90, 1));
            pokemonList.add(new Pokemon(60, "Kadabra", "Psíquico", 40, 35, 30, 70, 105, 1));
            pokemonList.add(new Pokemon(61, "Alakazam", "Psíquico", 50, 135, 30, 95, 120, 1));
            pokemonList.add(new Pokemon(62, "Machop", "Lucha", 70, 50, 80, 35, 70, 1));
            pokemonList.add(new Pokemon(63, "Machoke", "Lucha", 80, 60, 100, 70, 45, 1));
            pokemonList.add(new Pokemon(64, "Machamp", "Lucha", 90, 130, 80, 65, 55, 1));
            pokemonList.add(new Pokemon(65, "Bellsprout", "Planta/Veneno", 50, 75, 35, 70, 40, 1));
            pokemonList.add(new Pokemon(66, "Weepinbell", "Planta/Veneno", 65, 90, 50, 80, 55, 1));
            pokemonList.add(new Pokemon(67, "Victreebel", "Planta/Veneno", 80, 100, 70, 60, 70, 1));
            pokemonList.add(new Pokemon(68, "Tentacool", "Agua/Veneno", 40, 40, 35, 100, 70, 1));
            pokemonList.add(new Pokemon(69, "Tentacruel", "Agua/Veneno", 80, 70, 65, 120, 100, 1));
            pokemonList.add(new Pokemon(70, "Geodude", "Roca/Tierra", 80, 30, 100, 30, 20, 1));
            pokemonList.add(new Pokemon(71, "Graveler", "Roca/Tierra", 95, 50, 115, 45, 35, 1));
            pokemonList.add(new Pokemon(72, "Golem", "Roca/Tierra", 110, 80, 130, 55, 45, 1));
            pokemonList.add(new Pokemon(73, "Ponyta", "Fuego", 50, 85, 55, 65, 90, 1));
            pokemonList.add(new Pokemon(74, "Rapidash", "Fuego", 65, 100, 70, 80, 105, 1));
            pokemonList.add(new Pokemon(75, "Slowpoke", "Agua/Psíquico", 90, 65, 65, 40, 15, 1));
            pokemonList.add(new Pokemon(76, "Slowbro", "Agua/Psíquico", 95, 75, 110, 80, 30, 1));
            pokemonList.add(new Pokemon(77, "Magnemite", "Eléctrico/Acero", 35, 55, 40, 55, 60, 1));
            pokemonList.add(new Pokemon(78, "Magneton", "Eléctrico/Acero", 50, 70, 55, 70, 70, 1));
            pokemonList.add(new Pokemon(79, "Farfetch'd", "Normal/Volador", 52, 65, 55, 58, 60, 1));
            pokemonList.add(new Pokemon(80, "Doduo", "Normal/Volador", 60, 60, 30, 30, 75, 1));
            pokemonList.add(new Pokemon(81, "Dodrio", "Normal/Volador", 110, 110, 70, 60, 100, 1));
            pokemonList.add(new Pokemon(82, "Seel", "Agua", 65, 40, 50, 50, 45, 1));
            pokemonList.add(new Pokemon(83, "Dewgong", "Agua/Hielo", 90, 70, 80, 95, 60, 1));
            pokemonList.add(new Pokemon(84, "Grimer", "Veneno", 80, 50, 80, 40, 45, 1));
            pokemonList.add(new Pokemon(85, "Muk", "Veneno", 105, 65, 105, 50, 50, 1));
            pokemonList.add(new Pokemon(86, "Shellder", "Agua", 40, 25, 55, 30, 40, 1));
            pokemonList.add(new Pokemon(87, "Cloyster", "Agua/Hielo", 50, 95, 180, 45, 70, 1));
            pokemonList.add(new Pokemon(88, "Gastly", "Fantasma/Veneno", 35, 100, 30, 30, 80, 1));
            pokemonList.add(new Pokemon(89, "Haunter", "Fantasma/Veneno", 50, 115, 30, 30, 95, 1));
            pokemonList.add(new Pokemon(90, "Gengar", "Fantasma/Veneno", 65, 130, 60, 75, 110, 1));
            pokemonList.add(new Pokemon(91, "Onix", "Roca/Tierra", 45, 60, 160, 30, 70, 1));
            pokemonList.add(new Pokemon(92, "Drowzee", "Psíquico", 50, 56, 60, 55, 48, 1));
            pokemonList.add(new Pokemon(93, "Hypno", "Psíquico", 78, 80, 73, 70, 67, 1));
            pokemonList.add(new Pokemon(94, "Krabby", "Agua", 30, 25, 55, 30, 50, 1));
            pokemonList.add(new Pokemon(95, "Kingler", "Agua", 90, 50, 75, 50, 55, 1));
            pokemonList.add(new Pokemon(96, "Voltorb", "Eléctrico", 30, 55, 40, 30, 100, 1));
            pokemonList.add(new Pokemon(97, "Electrode", "Eléctrico", 60, 50, 40, 55, 140, 1));
            pokemonList.add(new Pokemon(98, "Exeggcute", "Planta/Psíquico", 40, 60, 40, 80, 40, 1));
            pokemonList.add(new Pokemon(99, "Exeggutor", "Planta/Psíquico", 95, 125, 85, 100, 55, 1));
            pokemonList.add(new Pokemon(100, "Cubone", "Tierra", 50, 50, 55, 40, 50, 1));
            pokemonList.add(new Pokemon(101, "Marowak", "Tierra", 60, 80, 110, 50, 45, 1));
            pokemonList.add(new Pokemon(102, "Hitmonlee", "Lucha", 120, 35, 110, 70, 87, 1));
            pokemonList.add(new Pokemon(103, "Hitmonchan", "Lucha", 105, 50, 79, 110, 76, 1));
            pokemonList.add(new Pokemon(104, "Lickitung", "Normal", 45, 35, 50, 70, 30, 1));
            pokemonList.add(new Pokemon(105, "Koffing", "Veneno", 65, 55, 95, 40, 50, 1));
            pokemonList.add(new Pokemon(106, "Weezing", "Veneno", 65, 90, 120, 65, 60, 1));
            pokemonList.add(new Pokemon(107, "Rhyhorn", "Roca/Tierra", 80, 25, 95, 30, 40, 1));
            pokemonList.add(new Pokemon(108, "Rhydon", "Roca/Tierra", 105, 40, 120, 45, 45, 1));
            pokemonList.add(new Pokemon(109, "Chansey", "Normal", 250, 5, 5, 105, 50, 1));
            pokemonList.add(new Pokemon(110, "Tangela", "Planta", 65, 55, 115, 100, 60, 1));
            pokemonList.add(new Pokemon(111, "Kangaskhan", "Normal", 95, 40, 80, 80, 90, 1));
            pokemonList.add(new Pokemon(112, "Horsea", "Agua", 30, 40, 70, 25, 60, 1));
            pokemonList.add(new Pokemon(113, "Seadra", "Agua", 55, 65, 55, 25, 85, 1));
            pokemonList.add(new Pokemon(114, "Goldeen", "Agua", 45, 40, 40, 50, 63, 1));
            pokemonList.add(new Pokemon(115, "Seaking", "Agua", 80, 65, 65, 68, 87, 1));
            pokemonList.add(new Pokemon(116, "Staryu", "Agua", 30, 55, 50, 70, 85, 1));
            pokemonList.add(new Pokemon(117, "Starmie", "Agua/Psíquico", 75, 100, 85, 85, 115, 1));
            pokemonList.add(new Pokemon(118, "Mr. Mime", "Psíquico/Hada", 40, 45, 65, 100, 90, 1));
            pokemonList.add(new Pokemon(119, "Scyther", "Bicho/Volador", 110, 55, 80, 80, 105, 1));
            pokemonList.add(new Pokemon(120, "Jynx", "Hielo/Psíquico", 50, 95, 60, 70, 65, 1));
            pokemonList.add(new Pokemon(121, "Electabuzz", "Eléctrico", 65, 83, 57, 40, 105, 1));
            pokemonList.add(new Pokemon(122, "Magmar", "Fuego", 65, 95, 57, 40, 93, 1));
            pokemonList.add(new Pokemon(123, "Pinsir", "Bicho", 125, 55, 80, 70, 85, 1));
            pokemonList.add(new Pokemon(124, "Tauros", "Normal", 100, 40, 95, 40, 110, 1));
            pokemonList.add(new Pokemon(125, "Magikarp", "Agua", 20, 15, 55, 20, 80, 1));
            pokemonList.add(new Pokemon(126, "Gyarados", "Agua/Volador", 95, 125, 79, 100, 81, 1));
            pokemonList.add(new Pokemon(127, "Lapras", "Agua/Hielo", 130, 85, 80, 95, 60, 1));
            pokemonList.add(new Pokemon(128, "Ditto", "Normal", 48, 48, 48, 48, 48, 1));
            pokemonList.add(new Pokemon(129, "Eevee", "Normal", 55, 40, 50, 65, 55, 1));
            pokemonList.add(new Pokemon(130, "Vaporeon", "Agua", 130, 110, 60, 65, 65, 1));
            pokemonList.add(new Pokemon(131, "Jolteon", "Eléctrico", 65, 110, 60, 60, 130, 1));
            pokemonList.add(new Pokemon(132, "Flareon", "Fuego", 65, 130, 60, 65, 110, 1));
            pokemonList.add(new Pokemon(133, "Porygon", "Normal", 65, 60, 70, 40, 40, 1));
            pokemonList.add(new Pokemon(134, "Omanyte", "Roca/Agua", 35, 40, 100, 90, 55, 1));
            pokemonList.add(new Pokemon(135, "Omastar", "Roca/Agua", 70, 60, 125, 115, 55, 1));
            pokemonList.add(new Pokemon(136, "Kabuto", "Roca/Agua", 30, 80, 90, 55, 55, 1));
            pokemonList.add(new Pokemon(137, "Kabutops", "Roca/Agua", 60, 115, 105, 70, 80, 1));
            pokemonList.add(new Pokemon(138, "Aerodactyl", "Roca/Volador", 60, 105, 65, 60, 130, 1));
            pokemonList.add(new Pokemon(139, "Snorlax", "Normal", 110, 65, 110, 65, 30, 1));
            pokemonList.add(new Pokemon(140, "Articuno", "Hielo/Volador", 90, 100, 85, 125, 85, 1));
            pokemonList.add(new Pokemon(141, "Zapdos", "Eléctrico/Volador", 90, 90, 85, 125, 100, 1));
            pokemonList.add(new Pokemon(142, "Moltres", "Fuego/Volador", 90, 100, 90, 125, 90, 1));
            pokemonList.add(new Pokemon(143, "Dratini", "Dragón", 41, 64, 45, 50, 50, 1));
            pokemonList.add(new Pokemon(144, "Dragonair", "Dragón", 61, 84, 65, 70, 60, 1));
            pokemonList.add(new Pokemon(145, "Dragonite", "Dragón/Volador", 134, 110, 95, 100, 80, 1));
            pokemonList.add(new Pokemon(146, "Mewtwo", "Psíquico", 106, 110, 90, 154, 130, 1));
            pokemonList.add(new Pokemon(147, "Mew", "Psíquico", 100, 100, 100, 100, 100, 1));

            return pokemonList;
        }

}}
