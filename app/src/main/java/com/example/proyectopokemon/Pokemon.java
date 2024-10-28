package com.example.proyectopokemon;

import java.util.List;
import java.util.ArrayList;

public class Pokemon {
    private int id;
    private String nombre;
    private List<String> tipo;
    private int ataque;
    private int ataqueEsp;
    private int defensa;
    private int defensaEsp;
    private int velocidad;
    private String foto;
    private int generacion;

    public Pokemon(int id,String nombre, List<String> tipo,  int ataque, int defensa, int ataqueEsp, int defensaEsp, int velocidad, int generacion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEsp = ataqueEsp;
        this.defensaEsp = defensaEsp;
        this.foto = "p"+id+".png";
        this.velocidad = velocidad;
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


    public List<String> getTipo() {
        return tipo;
    }

    public void setTipo(List<String> tipo) {
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


    public static List<Pokemon> generarPrimeraGen() {
        List<Pokemon> pokemonList = new ArrayList<>();

        pokemonList.add(new Pokemon(1, "Bulbasaur", List.of("Planta", "Veneno"), 49, 49, 65, 65, 45, 1));
        pokemonList.add(new Pokemon(2, "Ivysaur", List.of("Planta", "Veneno"), 62, 63, 80, 80, 60, 1));
        pokemonList.add(new Pokemon(3, "Venusaur", List.of("Planta", "Veneno"), 82, 83, 100, 100, 80, 1));
        pokemonList.add(new Pokemon(4, "Charmander", List.of("Fuego"), 52, 43, 60, 50, 65, 1));
        pokemonList.add(new Pokemon(5, "Charmeleon", List.of("Fuego"), 64, 58, 80, 65, 80, 1));
        pokemonList.add(new Pokemon(6, "Charizard", List.of("Fuego", "Volador"), 84, 78, 109, 85, 100, 1));
        pokemonList.add(new Pokemon(7, "Squirtle", List.of("Agua"), 48, 65, 50, 64, 43, 1));
        pokemonList.add(new Pokemon(8, "Wartortle", List.of("Agua"), 63, 80, 65, 80, 58, 1));
        pokemonList.add(new Pokemon(9, "Blastoise", List.of("Agua"), 83, 100, 85, 105, 78, 1));
        pokemonList.add(new Pokemon(10, "Caterpie", List.of("Bicho"), 30, 35, 20, 20, 45, 1));
        pokemonList.add(new Pokemon(11, "Metapod", List.of("Bicho"), 20, 55, 25, 25, 30, 1));
        pokemonList.add(new Pokemon(12, "Butterfree", List.of("Bicho", "Volador"), 45, 40, 80, 80, 70, 1));
        pokemonList.add(new Pokemon(13, "Weedle", List.of("Bicho", "Veneno"), 40, 30, 35, 20, 50, 1));
        pokemonList.add(new Pokemon(14, "Kakuna", List.of("Bicho", "Veneno"), 45, 50, 25, 25, 35, 1));
        pokemonList.add(new Pokemon(15, "Beedrill", List.of("Bicho", "Veneno"), 65, 40, 50, 80, 75, 1));
        pokemonList.add(new Pokemon(16, "Pidgey", List.of("Normal", "Volador"), 40, 30, 35, 30, 56, 1));
        pokemonList.add(new Pokemon(17, "Pidgeotto", List.of("Normal", "Volador"), 63, 55, 60, 50, 71, 1));
        pokemonList.add(new Pokemon(18, "Pidgeot", List.of("Normal", "Volador"), 83, 75, 80, 70, 91, 1));
        pokemonList.add(new Pokemon(19, "Rattata", List.of("Normal"), 30, 35, 25, 35, 72, 1));
        pokemonList.add(new Pokemon(20, "Raticate", List.of("Normal"), 55, 50, 50, 50, 97, 1));
        pokemonList.add(new Pokemon(21, "Spearow", List.of("Normal", "Volador"), 55, 30, 40, 30, 70, 1));
        pokemonList.add(new Pokemon(22, "Fearow", List.of("Normal", "Volador"), 65, 50, 61, 50, 100, 1));
        pokemonList.add(new Pokemon(23, "Ekans", List.of("Veneno"), 60, 41, 40, 40, 55, 1));
        pokemonList.add(new Pokemon(24, "Arbok", List.of("Veneno"), 85, 69, 65, 65, 80, 1));
        pokemonList.add(new Pokemon(25, "Pikachu", List.of("Eléctrico"), 55, 40, 35, 50, 90, 1));
        pokemonList.add(new Pokemon(26, "Raichu", List.of("Eléctrico"), 90, 55, 90, 80, 110, 1));
        pokemonList.add(new Pokemon(27, "Sandshrew", List.of("Tierra"), 50, 85, 75, 55, 40, 1));
        pokemonList.add(new Pokemon(28, "Sandslash", List.of("Tierra"), 75, 110, 100, 65, 55, 1));
        pokemonList.add(new Pokemon(29, "Nidoran♀", List.of("Veneno"), 47, 52, 40, 40, 41, 1));
        pokemonList.add(new Pokemon(30, "Nidorina", List.of("Veneno"), 62, 57, 55, 55, 56, 1));
        pokemonList.add(new Pokemon(31, "Nidoqueen", List.of("Veneno", "Tierra"), 90, 87, 75, 85, 76, 1));
        pokemonList.add(new Pokemon(32, "Nidoran♂", List.of("Veneno"), 46, 50, 40, 40, 50, 1));
        pokemonList.add(new Pokemon(33, "Nidorino", List.of("Veneno"), 57, 40, 55, 40, 65, 1));
        pokemonList.add(new Pokemon(34, "Nidoking", List.of("Veneno", "Tierra"), 81, 77, 92, 75, 85, 1));
        pokemonList.add(new Pokemon(35, "Clefairy", List.of("Hada"), 70, 55, 60, 65, 35, 1));
        pokemonList.add(new Pokemon(36, "Clefable", List.of("Hada"), 95, 70, 73, 90, 60, 1));
        pokemonList.add(new Pokemon(37, "Vulpix", List.of("Fuego"), 38, 30, 50, 65, 65, 1));
        pokemonList.add(new Pokemon(38, "Ninetales", List.of("Fuego"), 76, 75, 60, 100, 100, 1));
        pokemonList.add(new Pokemon(39, "Jigglypuff", List.of("Normal", "Hada"), 115, 45, 50, 55, 20, 1));
        pokemonList.add(new Pokemon(40, "Wigglytuff", List.of("Normal", "Hada"), 90, 70, 75, 80, 45, 1));
        pokemonList.add(new Pokemon(41, "Zubat", List.of("Bicho", "Veneno"), 45, 40, 45, 40, 55, 1));
        pokemonList.add(new Pokemon(42, "Golbat", List.of("Bicho", "Veneno"), 75, 70, 75, 65, 90, 1));
        pokemonList.add(new Pokemon(43, "Oddish", List.of("Planta", "Veneno"), 45, 40, 50, 55, 30, 1));
        pokemonList.add(new Pokemon(44, "Gloom", List.of("Planta", "Veneno"), 60, 55, 55, 65, 40, 1));
        pokemonList.add(new Pokemon(45, "Vileplume", List.of("Planta", "Veneno"), 75, 80, 70, 110, 50, 1));
        pokemonList.add(new Pokemon(46, "Paras", List.of("Bicho", "Planta"), 35, 70, 55, 55, 25, 1));
        pokemonList.add(new Pokemon(47, "Parasect", List.of("Bicho", "Planta"), 60, 95, 80, 80, 30, 1));
        pokemonList.add(new Pokemon(48, "Venonat", List.of("Bicho", "Veneno"), 60, 55, 50, 55, 45, 1));
        pokemonList.add(new Pokemon(49, "Venomoth", List.of("Bicho", "Veneno"), 70, 60, 50, 90, 90, 1));
        pokemonList.add(new Pokemon(50, "Diglett", List.of("Tierra"), 10, 55, 25, 45, 95, 1));
        pokemonList.add(new Pokemon(51, "Dugtrio", List.of("Tierra"), 80, 110, 50, 50, 120, 1));
        pokemonList.add(new Pokemon(52, "Meowth", List.of("Normal"), 45, 40, 35, 40, 90, 1));
        pokemonList.add(new Pokemon(53, "Persian", List.of("Normal"), 70, 60, 55, 65, 115, 1));
        pokemonList.add(new Pokemon(54, "Psyduck", List.of("Agua"), 50, 52, 48, 65, 55, 1));
        pokemonList.add(new Pokemon(55, "Golduck", List.of("Agua"), 80, 82, 78, 95, 85, 1));
        pokemonList.add(new Pokemon(56, "Mankey", List.of("Lucha"), 40, 80, 35, 70,  63, 1));
        pokemonList.add(new Pokemon(57, "Primeape", List.of("Lucha"), 65, 105, 60, 95,  239, 1));
        pokemonList.add(new Pokemon(58, "Growlithe", List.of("Fuego"), 55, 70, 45, 60, 63, 1));
        pokemonList.add(new Pokemon(59, "Arcanine", List.of("Fuego"), 90, 110, 80, 95, 239, 1));
        pokemonList.add(new Pokemon(60, "Poliwag", List.of("Agua"), 40, 50, 40, 40, 90, 1));
        pokemonList.add(new Pokemon(61, "Poliwhirl", List.of("Agua"), 65, 65, 65, 50, 70, 1));
        pokemonList.add(new Pokemon(62, "Poliwrath", List.of("Agua", "Lucha"), 90, 95, 95, 70, 70, 1));
        pokemonList.add(new Pokemon(63, "Abra", List.of("Psíquico"), 20, 15, 55, 55, 90, 1));
        pokemonList.add(new Pokemon(64, "Kadabra", List.of("Psíquico"), 40, 35, 60, 70, 105, 1));
        pokemonList.add(new Pokemon(65, "Alakazam", List.of("Psíquico"), 55, 40, 50, 65, 120, 1));
        pokemonList.add(new Pokemon(66, "Machop", List.of("Lucha"), 70, 80, 50, 55, 35, 1));
        pokemonList.add(new Pokemon(67, "Machoke", List.of("Lucha"), 80, 100, 70, 80, 45, 1));
        pokemonList.add(new Pokemon(68, "Machamp", List.of("Lucha"), 90, 130, 80, 85, 55, 1));
        pokemonList.add(new Pokemon(69, "Bellsprout", List.of("Planta", "Veneno"), 50, 75, 35, 70, 40, 1));
        pokemonList.add(new Pokemon(70, "Weepinbell", List.of("Planta", "Veneno"), 65, 90, 50, 85, 55, 1));
        pokemonList.add(new Pokemon(71, "Victreebel", List.of("Planta", "Veneno"), 80, 105, 65, 100, 70, 1));
        pokemonList.add(new Pokemon(72, "Tentacool", List.of("Agua", "Veneno"), 40, 40, 35, 100, 70, 1));
        pokemonList.add(new Pokemon(73, "Tentacruel", List.of("Agua", "Veneno"), 80, 70, 65, 120, 100, 1));
        pokemonList.add(new Pokemon(74, "Geodude", List.of("Roca", "Tierra"), 80, 100, 110, 30, 20, 1));
        pokemonList.add(new Pokemon(75, "Graveler", List.of("Roca", "Tierra"), 95, 115, 130, 40, 30, 1));
        pokemonList.add(new Pokemon(76, "Golem", List.of("Roca", "Tierra"), 110, 130, 160, 55, 45, 1));
        pokemonList.add(new Pokemon(77, "Ponyta", List.of("Fuego"), 50, 55, 40, 40, 90, 1));
        pokemonList.add(new Pokemon(78, "Rapidash", List.of("Fuego"), 65, 70, 50, 50, 105, 1));
        pokemonList.add(new Pokemon(79, "Slowpoke", List.of("Agua", "Psíquico"), 90, 65, 65, 40, 15, 1));
        pokemonList.add(new Pokemon(80, "Slowbro", List.of("Agua", "Psíquico"), 95, 75, 110, 80, 30, 1));
        pokemonList.add(new Pokemon(81, "Magnemite", List.of("Eléctrico", "Acero"), 25, 35, 70, 95, 60, 1));
        pokemonList.add(new Pokemon(82, "Magneton", List.of("Eléctrico", "Acero"), 50, 60, 95, 120, 70, 1));
        pokemonList.add(new Pokemon(83, "Farfetch'd", List.of("Normal", "Volador"), 52, 55, 50, 58, 60, 1));
        pokemonList.add(new Pokemon(84, "Doduo", List.of("Normal", "Volador"), 60, 45, 40, 35, 75, 1));
        pokemonList.add(new Pokemon(85, "Dodrio", List.of("Normal", "Volador"), 110, 70, 60, 60, 100, 1));
        pokemonList.add(new Pokemon(86, "Seel", List.of("Agua"), 65, 60, 55, 50, 45, 1));
        pokemonList.add(new Pokemon(87, "Dewgong", List.of("Agua", "Hielo"), 90, 70, 80, 95, 60, 1));
        pokemonList.add(new Pokemon(88, "Grimer", List.of("Veneno"), 80, 80, 50, 25, 40, 1));
        pokemonList.add(new Pokemon(89, "Muk", List.of("Veneno"), 105, 105, 75, 50, 50, 1));
        pokemonList.add(new Pokemon(90, "Shellder", List.of("Agua", "Hielo"), 40, 55, 40, 25, 70, 1));
        pokemonList.add(new Pokemon(91, "Cloyster", List.of("Agua", "Hielo"), 50, 65, 95, 70, 40, 1));
        pokemonList.add(new Pokemon(92, "Gastly", List.of("Fantasma", "Veneno"), 30, 35, 30, 100, 80, 1));
        pokemonList.add(new Pokemon(93, "Haunter", List.of("Fantasma", "Veneno"), 45, 50, 45, 115, 95, 1));
        pokemonList.add(new Pokemon(94, "Gengar", List.of("Fantasma", "Veneno"), 60, 65, 60, 130, 110, 1));
        pokemonList.add(new Pokemon(95, "Onix", List.of("Roca", "Tierra"), 35, 45, 160, 30, 70, 1));
        pokemonList.add(new Pokemon(96, "Drowzee", List.of("Psíquico"), 60, 48, 45, 43, 42, 1));
        pokemonList.add(new Pokemon(97, "Hypno", List.of("Psíquico"), 85, 73, 70, 73, 67, 1));
        pokemonList.add(new Pokemon(98, "Krabby", List.of("Agua"), 30, 105, 90, 25, 50, 1));
        pokemonList.add(new Pokemon(99, "Kingler", List.of("Agua"), 55, 130, 115, 50, 75, 1));
        pokemonList.add(new Pokemon(100, "Voltorb", List.of("Eléctrico"), 40, 30, 35, 55, 100, 1));
        pokemonList.add(new Pokemon(101, "Electrode", List.of("Eléctrico"), 60, 50, 70, 80, 140, 1));
        pokemonList.add(new Pokemon(102, "Exeggcute", List.of("Planta", "Psíquico"), 60, 40, 80, 60, 40, 1));
        pokemonList.add(new Pokemon(103, "Exeggutor", List.of("Planta", "Psíquico"), 95, 95, 80, 60, 55, 1));
        pokemonList.add(new Pokemon(104, "Cubone", List.of("Tierra"), 50, 50, 95, 40, 35, 1));
        pokemonList.add(new Pokemon(105, "Marowak", List.of("Tierra"), 60, 80, 110, 50, 45, 1));
        pokemonList.add(new Pokemon(106, "Hitmonlee", List.of("Lucha"), 50, 120, 53, 35, 87, 1));
        pokemonList.add(new Pokemon(107, "Hitmonchan", List.of("Lucha"), 50, 105, 79, 35, 76, 1));
        pokemonList.add(new Pokemon(108, "Lickitung", List.of("Normal"), 90, 55, 75, 60, 30, 1));
        pokemonList.add(new Pokemon(109, "Koffing", List.of("Veneno"), 40, 65, 95, 60, 35, 1));
        pokemonList.add(new Pokemon(110, "Weezing", List.of("Veneno"), 65, 90, 120, 85, 60, 1));
        pokemonList.add(new Pokemon(111, "Rhyhorn", List.of("Roca", "Tierra"), 80, 85, 95, 30, 25, 1));
        pokemonList.add(new Pokemon(112, "Rhydon", List.of("Roca", "Tierra"), 105, 130, 120, 45, 40, 1));
        pokemonList.add(new Pokemon(113, "Chansey", List.of("Normal"), 250, 5, 70, 35, 50, 1));
        pokemonList.add(new Pokemon(114, "Tangela", List.of("Planta"), 65, 55, 115, 100, 60, 1));
        pokemonList.add(new Pokemon(115, "Kangaskhan", List.of("Normal"), 105, 95, 80, 40, 90, 1));
        pokemonList.add(new Pokemon(116, "Horsea", List.of("Agua"), 30, 40, 70, 25, 60, 1));
        pokemonList.add(new Pokemon(117, "Seadra", List.of("Agua"), 55, 65, 95, 40, 85, 1));
        pokemonList.add(new Pokemon(118, "Goldeen", List.of("Agua"), 45, 60, 30, 50, 63, 1));
        pokemonList.add(new Pokemon(119, "Seaking", List.of("Agua"), 80, 92, 65, 80, 68, 1));
        pokemonList.add(new Pokemon(120, "Staryu", List.of("Agua"), 30, 45, 55, 70, 85, 1));
        pokemonList.add(new Pokemon(121, "Starmie", List.of("Agua", "Psíquico"), 60, 75, 85, 100, 115, 1));
        pokemonList.add(new Pokemon(122, "Mr. Mime", List.of("Psíquico", "Hada"), 40, 45, 65, 100, 90, 1));
        pokemonList.add(new Pokemon(123, "Scyther", List.of("Bicho", "Volador"), 70, 110, 80, 55, 80, 1));
        pokemonList.add(new Pokemon(124, "Jynx", List.of("Hielo", "Psíquico"), 65, 50, 35, 95, 75, 1));
        pokemonList.add(new Pokemon(125, "Electabuzz", List.of("Eléctrico"), 65, 83, 57, 40, 87, 1));
        pokemonList.add(new Pokemon(126, "Magmar", List.of("Fuego"), 65, 95, 57, 40, 93, 1));
        pokemonList.add(new Pokemon(127, "Pinsir", List.of("Bicho"), 65, 125, 100, 70, 85, 1));
        pokemonList.add(new Pokemon(128, "Tauros", List.of("Normal"), 100, 100, 95, 40, 110, 1));
        pokemonList.add(new Pokemon(129, "Magikarp", List.of("Agua"), 20, 10, 55, 20, 80, 1));
        pokemonList.add(new Pokemon(130, "Gyarados", List.of("Agua", "Volador"), 95, 125, 79, 100, 81, 1));
        pokemonList.add(new Pokemon(131, "Lapras", List.of("Agua", "Hielo"), 130, 85, 80, 95, 60, 1));
        pokemonList.add(new Pokemon(132, "Ditto", List.of("Normal"), 48, 48, 48, 48, 48, 1));
        pokemonList.add(new Pokemon(133, "Eevee", List.of("Normal"), 55, 40, 50, 55, 55, 1));
        pokemonList.add(new Pokemon(134, "Vaporeon", List.of("Agua"), 130, 65, 60, 110, 65, 1));
        pokemonList.add(new Pokemon(135, "Jolteon", List.of("Eléctrico"), 65, 65, 60, 110, 130, 1));
        pokemonList.add(new Pokemon(136, "Flareon", List.of("Fuego"), 65, 130, 60, 110, 65, 1));
        pokemonList.add(new Pokemon(137, "Porygon", List.of("Normal"), 65, 60, 70, 75, 40, 1));
        pokemonList.add(new Pokemon(138, "Omanyte", List.of("Roca", "Agua"), 35, 40, 100, 90, 55, 1));
        pokemonList.add(new Pokemon(139, "Omastar", List.of("Roca", "Agua"), 70, 60, 125, 115, 55, 1));
        pokemonList.add(new Pokemon(140, "Kabuto", List.of("Roca", "Agua"), 30, 80, 90, 55, 55, 1));
        pokemonList.add(new Pokemon(141, "Kabutops", List.of("Roca", "Agua"), 60, 115, 105, 65, 80, 1));
        pokemonList.add(new Pokemon(142, "Aerodactyl", List.of("Roca", "Volador"), 80, 105, 65, 60, 130, 1));
        pokemonList.add(new Pokemon(143, "Snorlax", List.of("Normal"), 160, 110, 65, 110, 30, 1));
        pokemonList.add(new Pokemon(144, "Articuno", List.of("Hielo", "Volador"), 90, 85, 100, 125, 20, 1));
        pokemonList.add(new Pokemon(145, "Zapdos", List.of("Eléctrico", "Volador"), 90, 90, 85, 125, 20, 1));
        pokemonList.add(new Pokemon(146, "Moltres", List.of("Fuego", "Volador"), 90, 100, 90, 125, 20, 1));
        pokemonList.add(new Pokemon(147, "Dratini", List.of("Dragón"), 41, 64, 45, 50, 50, 1));
        pokemonList.add(new Pokemon(148, "Dragonair", List.of("Dragón"), 61, 84, 65, 70, 60, 1));
        pokemonList.add(new Pokemon(149, "Dragonite", List.of("Dragón", "Volador"), 91, 134, 95, 100, 80, 1));
        pokemonList.add(new Pokemon(150, "Mewtwo", List.of("Psíquico"), 106, 110, 90, 154, 130, 1));
        pokemonList.add(new Pokemon(151, "Mew", List.of("Psíquico"), 100, 100, 100, 100, 100, 1));

        return pokemonList;
        }

    public static List<Pokemon> generarSegundaGen() {
        List<Pokemon> pokemonList = new ArrayList<>();


        pokemonList.add(new Pokemon(152, "Chikorita", List.of("Planta"), 45, 49, 65, 49, 45, 2));
        pokemonList.add(new Pokemon(153, "Bayleef", List.of("Planta"), 60, 62, 80, 63, 60, 2));
        pokemonList.add(new Pokemon(154, "Meganium", List.of("Planta"), 80, 82, 100, 83, 80, 2));
        pokemonList.add(new Pokemon(155, "Cyndaquil", List.of("Fuego"), 39, 52, 43, 60, 65, 2));
        pokemonList.add(new Pokemon(156, "Quilava", List.of("Fuego"), 58, 64, 58, 80, 80, 2));
        pokemonList.add(new Pokemon(157, "Typhlosion", List.of("Fuego"), 78, 84, 78, 109, 85, 2));
        pokemonList.add(new Pokemon(158, "Totodile", List.of("Agua"), 50, 65, 64, 44, 43, 2));
        pokemonList.add(new Pokemon(159, "Croconaw", List.of("Agua"), 65, 80, 80, 59, 58, 2));
        pokemonList.add(new Pokemon(160, "Feraligatr", List.of("Agua"), 85, 105, 100, 79, 83, 2));
        pokemonList.add(new Pokemon(161, "Sentret", List.of("Normal"), 35, 46, 40, 35, 20, 2));
        pokemonList.add(new Pokemon(162, "Furret", List.of("Normal"), 85, 76, 60, 65, 90, 2));
        pokemonList.add(new Pokemon(163, "Hoothoot", List.of("Normal", "Volador"), 60, 30, 30, 50, 50, 2));
        pokemonList.add(new Pokemon(164, "Noctowl", List.of("Normal", "Volador"), 100, 50, 50, 70, 70, 2));
        pokemonList.add(new Pokemon(165, "Ledyba", List.of("Bicho", "Volador"), 40, 20, 30, 40, 55, 2));
        pokemonList.add(new Pokemon(166, "Ledian", List.of("Bicho", "Volador"), 55, 35, 50, 55, 85, 2));
        pokemonList.add(new Pokemon(167, "Spinarak", List.of("Bicho", "Veneno"), 40, 60, 40, 40, 30, 2));
        pokemonList.add(new Pokemon(168, "Ariados", List.of("Bicho", "Veneno"), 70, 90, 70, 60, 40, 2));
        pokemonList.add(new Pokemon(169, "Crobat", List.of("Veneno", "Volador"), 85, 90, 80, 70, 130, 2));
        pokemonList.add(new Pokemon(170, "Chinchou", List.of("Agua", "Eléctrico"), 75, 38, 38, 56, 67, 2));
        pokemonList.add(new Pokemon(171, "Lanturn", List.of("Agua", "Eléctrico"), 125, 58, 58, 76, 67, 2));
        pokemonList.add(new Pokemon(172, "Pichu", List.of("Eléctrico"), 20, 40, 15, 35, 60, 2));
        pokemonList.add(new Pokemon(173, "Cleffa", List.of("Hada"), 50, 25, 28, 45, 15, 2));
        pokemonList.add(new Pokemon(174, "Igglybuff", List.of("Normal", "Hada"), 90, 30, 15, 40, 20, 2));
        pokemonList.add(new Pokemon(175, "Togepi", List.of("Hada"), 35, 20, 65, 40, 20, 2));
        pokemonList.add(new Pokemon(176, "Togetic", List.of("Hada", "Volador"), 55, 40, 85, 80, 40, 2));
        pokemonList.add(new Pokemon(177, "Natu", List.of("Psíquico", "Volador"), 40, 40, 30, 70, 50, 2));
        pokemonList.add(new Pokemon(178, "Xatu", List.of("Psíquico", "Volador"), 65, 50, 50, 95, 70, 2));
        pokemonList.add(new Pokemon(179, "Mareep", List.of("Eléctrico"), 55, 40, 40, 65, 55, 2));
        pokemonList.add(new Pokemon(180, "Flaaffy", List.of("Eléctrico"), 70, 55, 55, 80, 60, 2));
        pokemonList.add(new Pokemon(181, "Ampharos", List.of("Eléctrico"), 90, 75, 85, 115, 90, 2));
        pokemonList.add(new Pokemon(182, "Bellossom", List.of("Planta"), 75, 80, 95, 90, 50, 2));
        pokemonList.add(new Pokemon(183, "Marill", List.of("Agua", "Hada"), 70, 20, 50, 20, 40, 2));
        pokemonList.add(new Pokemon(184, "Azumarill", List.of("Agua", "Hada"), 100, 50, 80, 60, 50, 2));
        pokemonList.add(new Pokemon(185, "Sudowoodo", List.of("Roca"), 70, 100, 115, 30, 65, 2));
        pokemonList.add(new Pokemon(186, "Politoed", List.of("Agua"), 90, 75, 70, 90, 70, 2));
        pokemonList.add(new Pokemon(187, "Hoppip", List.of("Planta", "Volador"), 35, 40, 50, 35, 55, 2));
        pokemonList.add(new Pokemon(188, "Skiploom", List.of("Planta", "Volador"), 55, 50, 55, 45, 65, 2));
        pokemonList.add(new Pokemon(189, "Jumpluff", List.of("Planta", "Volador"), 75, 55, 70, 55, 110, 2));
        pokemonList.add(new Pokemon(190, "Aipom", List.of("Normal"), 55, 70, 55, 40, 85, 2));
        pokemonList.add(new Pokemon(191, "Sunkern", List.of("Planta"), 30, 30, 30, 30, 30, 2));
        pokemonList.add(new Pokemon(192, "Sunflora", List.of("Planta"), 75, 75, 55, 105, 30, 2));
        pokemonList.add(new Pokemon(193, "Yanma", List.of("Bicho", "Volador"), 65, 65, 45, 75, 95, 2));
        pokemonList.add(new Pokemon(194, "Wooper", List.of("Agua", "Tierra"), 50, 50, 40, 25, 15, 2));
        pokemonList.add(new Pokemon(195, "Quagsire", List.of("Agua", "Tierra"), 95, 85, 80, 65, 35, 2));
        pokemonList.add(new Pokemon(196, "Espeon", List.of("Psíquico"), 65, 65, 60, 130, 110, 2));
        pokemonList.add(new Pokemon(197, "Umbreon", List.of("Siniestro"), 95, 65, 110, 60, 65, 2));
        pokemonList.add(new Pokemon(198, "Murkrow", List.of("Siniestro", "Volador"), 60, 85, 42, 85, 91, 2));
        pokemonList.add(new Pokemon(199, "Slowking", List.of("Agua", "Psíquico"), 95, 75, 80, 100, 30, 2));
        pokemonList.add(new Pokemon(200, "Misdreavus", List.of("Fantasma"), 60, 60, 60, 85, 85, 2));
        pokemonList.add(new Pokemon(201, "Unown", List.of("Psíquico"), 48, 72, 48, 72, 48, 2));
        pokemonList.add(new Pokemon(202, "Wobbuffet", List.of("Psíquico"), 190, 33, 58, 33, 33, 2));
        pokemonList.add(new Pokemon(203, "Girafarig", List.of("Normal", "Psíquico"), 70, 80, 65, 90, 60, 2));
        pokemonList.add(new Pokemon(204, "Pineco", List.of("Bicho"), 50, 65, 90, 35, 15, 2));
        pokemonList.add(new Pokemon(205, "Forretress", List.of("Bicho", "Roca"), 75, 90, 140, 60, 40, 2));
        pokemonList.add(new Pokemon(206, "Dunsparce", List.of("Normal"), 100, 70, 70, 65, 45, 2));
        pokemonList.add(new Pokemon(207, "Gligar", List.of("Tierra", "Volador"), 65, 75, 105, 35, 85, 2));
        pokemonList.add(new Pokemon(208, "Steelix", List.of("Acero", "Tierra"), 75, 85, 200, 55, 30, 2));
        pokemonList.add(new Pokemon(209, "Snubbull", List.of("Normal"), 60, 80, 50, 40, 30, 2));
        pokemonList.add(new Pokemon(210, "Granbull", List.of("Normal"), 90, 120, 75, 60, 45, 2));
        pokemonList.add(new Pokemon(211, "Qwilfish", List.of("Agua", "Veneno"), 65, 95, 75, 55, 85, 2));
        pokemonList.add(new Pokemon(212, "Scizor", List.of("Bicho", "Acero"), 70, 130, 100, 55, 65, 2));
        pokemonList.add(new Pokemon(213, "Shuckle", List.of("Bicho", "Roca"), 20, 10, 230, 10, 20, 2));
        pokemonList.add(new Pokemon(214, "Heracross", List.of("Bicho", "Lucha"), 80, 125, 75, 40, 85, 2));
        pokemonList.add(new Pokemon(215, "Sneasel", List.of("Siniestro", "Hielo"), 55, 95, 55, 35, 115, 2));
        pokemonList.add(new Pokemon(216, "Teddiursa", List.of("Normal"), 60, 80, 50, 50, 40, 2));
        pokemonList.add(new Pokemon(217, "Ursaring", List.of("Normal"), 90, 130, 75, 75, 55, 2));
        pokemonList.add(new Pokemon(218, "Slugma", List.of("Fuego"), 40, 40, 40, 70, 20, 2));
        pokemonList.add(new Pokemon(219, "Magcargo", List.of("Fuego", "Roca"), 60, 50, 120, 90, 30, 2));
        pokemonList.add(new Pokemon(220, "Swinub", List.of("Hielo", "Tierra"), 50, 50, 40, 30, 50, 2));
        pokemonList.add(new Pokemon(221, "Piloswine", List.of("Hielo", "Tierra"), 100, 100, 80, 60, 50, 2));
        pokemonList.add(new Pokemon(222, "Corsola", List.of("Agua", "Roca"), 55, 55, 85, 65, 35, 2));
        pokemonList.add(new Pokemon(223, "Remoraid", List.of("Agua"), 35, 65, 35, 65, 65, 2));
        pokemonList.add(new Pokemon(224, "Octillery", List.of("Agua"), 75, 105, 75, 105, 45, 2));
        pokemonList.add(new Pokemon(225, "Delibird", List.of("Hielo", "Volador"), 45, 55, 40, 65, 75, 2));
        pokemonList.add(new Pokemon(226, "Mantine", List.of("Agua", "Volador"), 65, 40, 70, 80, 140, 2));
        pokemonList.add(new Pokemon(227, "Skarmory", List.of("Acero", "Volador"), 65, 80, 140, 40, 70, 2));
        pokemonList.add(new Pokemon(228, "Houndour", List.of("Fuego", "Siniestro"), 45, 60, 30, 80, 65, 2));
        pokemonList.add(new Pokemon(229, "Houndoom", List.of("Fuego", "Siniestro"), 75, 90, 50, 110, 95, 2));
        pokemonList.add(new Pokemon(230, "Kingdra", List.of("Agua", "Dragón"), 75, 95, 95, 95, 85, 2));
        pokemonList.add(new Pokemon(231, "Phanpy", List.of("Tierra"), 90, 60, 60, 40, 40, 2));
        pokemonList.add(new Pokemon(232, "Donphan", List.of("Tierra"), 90, 120, 120, 60, 50, 2));
        pokemonList.add(new Pokemon(233, "Porygon2", List.of("Normal"), 85, 80, 90, 105, 60, 2));
        pokemonList.add(new Pokemon(234, "Stantler", List.of("Normal"), 73, 95, 62, 85, 85, 2));
        pokemonList.add(new Pokemon(235, "Smeargle", List.of("Normal"), 55, 20, 35, 20, 75, 2));
        pokemonList.add(new Pokemon(236, "Tyrogue", List.of("Lucha"), 35, 35, 35, 35, 35, 2));
        pokemonList.add(new Pokemon(237, "Hitmontop", List.of("Lucha"), 50, 95, 95, 35, 70, 2));
        pokemonList.add(new Pokemon(238, "Smoochum", List.of("Hielo", "Psíquico"), 45, 30, 15, 85, 65, 2));
        pokemonList.add(new Pokemon(239, "Elekid", List.of("Eléctrico"), 45, 63, 37, 65, 95, 2));
        pokemonList.add(new Pokemon(240, "Magby", List.of("Fuego"), 45, 75, 50, 70, 83, 2));
        pokemonList.add(new Pokemon(241, "Miltank", List.of("Normal"), 95, 80, 105, 40, 100, 2));
        pokemonList.add(new Pokemon(242, "Blissey", List.of("Normal"), 255, 10, 70, 95, 60, 2));
        pokemonList.add(new Pokemon(243, "Raikou", List.of("Eléctrico"), 90, 115, 75, 115, 85, 2));
        pokemonList.add(new Pokemon(244, "Entei", List.of("Fuego"), 115, 115, 85, 90, 75, 2));
        pokemonList.add(new Pokemon(245, "Suicune", List.of("Agua"), 100, 75, 115, 90, 85, 2));
        pokemonList.add(new Pokemon(246, "Larvitar", List.of("Roca", "Tierra"), 50, 64, 50, 45, 48, 2));
        pokemonList.add(new Pokemon(247, "Pupitar", List.of("Roca", "Tierra"), 70, 84, 70, 60, 50, 2));
        pokemonList.add(new Pokemon(248, "Tyranitar", List.of("Roca", "Siniestro"), 100, 134, 110, 95, 61, 2));
        pokemonList.add(new Pokemon(249, "Lugia", List.of("Psíquico", "Volador"), 106, 90, 130, 90, 110, 2));
        pokemonList.add(new Pokemon(250, "Ho-Oh", List.of("Fuego", "Volador"), 106, 130, 90, 110, 90, 2));
        pokemonList.add(new Pokemon(251, "Celebi", List.of("Psíquico", "Planta"), 100, 100, 100, 100, 100, 2));


        return pokemonList;
    }

    public List<Pokemon> generarTerceraGen(){
        List<Pokemon> pokemonList=new ArrayList<>();

        pokemonList.add(new Pokemon(252, "Treecko", List.of("Planta"), 40, 45, 35, 65, 55, 3));
        pokemonList.add(new Pokemon(253, "Grovyle", List.of("Planta"), 50, 65, 45, 85, 65, 3));
        pokemonList.add(new Pokemon(254, "Sceptile", List.of("Planta"), 70, 85, 65, 105, 80, 3));
        pokemonList.add(new Pokemon(255, "Torchic", List.of("Fuego"), 45, 60, 40, 70, 50, 3));
        pokemonList.add(new Pokemon(256, "Combusken", List.of("Fuego", "Lucha"), 60, 85, 60, 70, 55, 3));
        pokemonList.add(new Pokemon(257, "Blaziken", List.of("Fuego", "Lucha"), 80, 120, 70, 110, 80, 3));
        pokemonList.add(new Pokemon(258, "Mudkip", List.of("Agua"), 50, 70, 50, 50, 50, 3));
        pokemonList.add(new Pokemon(259, "Marshtomp", List.of("Agua", "Tierra"), 70, 85, 70, 60, 50, 3));
        pokemonList.add(new Pokemon(260, "Swampert", List.of("Agua", "Tierra"), 100, 110, 90, 60, 70, 3));
        pokemonList.add(new Pokemon(261, "Poochyena", List.of("Siniestro"), 35, 55, 35, 30, 35, 3));
        pokemonList.add(new Pokemon(262, "Mightyena", List.of("Siniestro"), 70, 90, 70, 70, 70, 3));
        pokemonList.add(new Pokemon(263, "Zigzagoon", List.of("Normal"), 38, 30, 41, 30, 60, 3));
        pokemonList.add(new Pokemon(264, "Linoone", List.of("Normal"), 78, 70, 61, 50, 100, 3));
        pokemonList.add(new Pokemon(265, "Wurmple", List.of("Bicho"), 45, 30, 35, 20, 30, 3));
        pokemonList.add(new Pokemon(266, "Silcoon", List.of("Bicho"), 50, 35, 55, 25, 20, 3));
        pokemonList.add(new Pokemon(267, "Beautifly", List.of("Bicho", "Volador"), 60, 70, 50, 100, 65, 3));
        pokemonList.add(new Pokemon(268, "Cascoon", List.of("Bicho"), 50, 35, 55, 25, 20, 3));
        pokemonList.add(new Pokemon(269, "Dustox", List.of("Bicho", "Veneno"), 60, 50, 70, 50, 65, 3));
        pokemonList.add(new Pokemon(270, "Lotad", List.of("Agua", "Planta"), 40, 30, 30, 40, 50, 3));
        pokemonList.add(new Pokemon(271, "Lombre", List.of("Agua", "Planta"), 60, 50, 50, 60, 50, 3));
        pokemonList.add(new Pokemon(272, "Ludicolo", List.of("Agua", "Planta"), 80, 70, 70, 90, 80, 3));
        pokemonList.add(new Pokemon(273, "Seedot", List.of("Planta"), 40, 40, 50, 30, 30, 3));
        pokemonList.add(new Pokemon(274, "Nuzleaf", List.of("Planta", "Siniestro"), 70, 70, 40, 60, 40, 3));
        pokemonList.add(new Pokemon(275, "Shiftry", List.of("Planta", "Siniestro"), 90, 100, 60, 90, 60, 3));
        pokemonList.add(new Pokemon(276, "Taillow", List.of("Normal", "Volador"), 40, 55, 30, 30, 85, 3));
        pokemonList.add(new Pokemon(277, "Swellow", List.of("Normal", "Volador"), 60, 85, 60, 50, 125, 3));
        pokemonList.add(new Pokemon(278, "Wingull", List.of("Agua", "Volador"), 40, 30, 30, 55, 85, 3));
        pokemonList.add(new Pokemon(279, "Pelipper", List.of("Agua", "Volador"), 60, 50, 100, 55, 65, 3));
        pokemonList.add(new Pokemon(280, "Ralts", List.of("Psíquico", "Hada"), 28, 25, 25, 45, 40, 3));
        pokemonList.add(new Pokemon(281, "Kirlia", List.of("Psíquico", "Hada"), 38, 35, 35, 50, 65, 3));
        pokemonList.add(new Pokemon(282, "Gardevoir", List.of("Psíquico", "Hada"), 68, 65, 65, 80, 100, 3));
        pokemonList.add(new Pokemon(283, "Surskit", List.of("Agua", "Bicho"), 40, 30, 32, 50, 65, 3));
        pokemonList.add(new Pokemon(284, "Masquerain", List.of("Bicho", "Volador"), 70, 60, 62, 80, 80, 3));
        pokemonList.add(new Pokemon(285, "Shroomish", List.of("Planta"), 60, 40, 60, 40, 35, 3));
        pokemonList.add(new Pokemon(286, "Breloom", List.of("Planta", "Lucha"), 60, 130, 80, 60, 70, 3));
        pokemonList.add(new Pokemon(287, "Slakoth", List.of("Normal"), 60, 60, 60, 35, 30, 3));
        pokemonList.add(new Pokemon(288, "Vigoroth", List.of("Normal"), 80, 80, 80, 55, 90, 3));
        pokemonList.add(new Pokemon(289, "Slaking", List.of("Normal"), 150, 160, 100, 95, 65, 3));
        pokemonList.add(new Pokemon(290, "Nincada", List.of("Bicho", "Tierra"), 31, 45, 90, 30, 40, 3));
        pokemonList.add(new Pokemon(291, "Ninjask", List.of("Bicho", "Volador"), 61, 90, 45, 50, 160, 3));
        pokemonList.add(new Pokemon(292, "Shedinja", List.of("Bicho", "Fantasma"), 40, 30, 30, 30, 40, 3));
        pokemonList.add(new Pokemon(293, "Whismur", List.of("Normal"), 64, 51, 23, 30, 28, 3));
        pokemonList.add(new Pokemon(294, "Loudred", List.of("Normal"), 84, 71, 43, 50, 48, 3));
        pokemonList.add(new Pokemon(295, "Exploud", List.of("Normal"), 104, 91, 63, 70, 68, 3));
        pokemonList.add(new Pokemon(296, "Makuhita", List.of("Lucha"), 72, 60, 30, 20, 25, 3));
        pokemonList.add(new Pokemon(297, "Hariyama", List.of("Lucha"), 144, 120, 60, 40, 50, 3));
        pokemonList.add(new Pokemon(298, "Azurill", List.of("Normal", "Hada"), 50, 40, 30, 20, 50, 3));
        pokemonList.add(new Pokemon(299, "Nosepass", List.of("Roca"), 30, 45, 135, 30, 30, 3));
        pokemonList.add(new Pokemon(300, "Skitty", List.of("Normal"), 50, 45, 40, 55, 50, 3));
        pokemonList.add(new Pokemon(301, "Delcatty", List.of("Normal"), 70, 65, 60, 70, 70, 3));
        pokemonList.add(new Pokemon(302, "Sableye", List.of("Siniestro", "Fantasma"), 50, 75, 75, 65, 50, 3));
        pokemonList.add(new Pokemon(303, "Mawile", List.of("Siniestro", "Hada"), 50, 85, 50, 55, 40, 3));
        pokemonList.add(new Pokemon(304, "Aron", List.of("Acero", "Roca"), 50, 70, 100, 40, 30, 3));
        pokemonList.add(new Pokemon(305, "Lairon", List.of("Acero", "Roca"), 60, 90, 140, 60, 30, 3));
        pokemonList.add(new Pokemon(306, "Aggron", List.of("Acero", "Roca"), 110, 130, 180, 60, 50, 3));
        pokemonList.add(new Pokemon(307, "Meditite", List.of("Lucha", "Psíquico"), 30, 40, 55, 40, 60, 3));
        pokemonList.add(new Pokemon(308, "Medicham", List.of("Lucha", "Psíquico"), 60, 60, 75, 80, 50, 3));
        pokemonList.add(new Pokemon(309, "Electrike", List.of("Eléctrico"), 40, 45, 40, 65, 55, 3));
        pokemonList.add(new Pokemon(310, "Manectric", List.of("Eléctrico"), 70, 75, 60, 105, 40, 3));
        pokemonList.add(new Pokemon(311, "Plusle", List.of("Eléctrico"), 60, 40, 35, 75, 85, 3));
        pokemonList.add(new Pokemon(312, "Minun", List.of("Eléctrico"), 60, 40, 35, 75, 85, 3));
        pokemonList.add(new Pokemon(313, "Volbeat", List.of("Bicho"), 65, 73, 55, 47, 85, 3));
        pokemonList.add(new Pokemon(314, "Illumise", List.of("Bicho"), 65, 47, 55, 73, 85, 3));
        pokemonList.add(new Pokemon(315, "Roselia", List.of("Planta", "Veneno"), 50, 60, 45, 100, 55, 3));
        pokemonList.add(new Pokemon(316, "Gulpin", List.of("Veneno"), 70, 43, 53, 43, 40, 3));
        pokemonList.add(new Pokemon(317, "Swalot", List.of("Veneno"), 100, 73, 83, 73, 55, 3));
        pokemonList.add(new Pokemon(318, "Carvanha", List.of("Agua", "Siniestro"), 45, 90, 20, 40, 65, 3));
        pokemonList.add(new Pokemon(319, "Sharpedo", List.of("Agua", "Siniestro"), 70, 120, 40, 95, 65, 3));
        pokemonList.add(new Pokemon(320, "Wailmer", List.of("Agua"), 130, 70, 35, 60, 60, 3));
        pokemonList.add(new Pokemon(321, "Wailord", List.of("Agua"), 200, 90, 45, 85, 60, 3));
        pokemonList.add(new Pokemon(322, "Numel", List.of("Fuego", "Tierra"), 60, 60, 40, 65, 45, 3));
        pokemonList.add(new Pokemon(323, "Camerupt", List.of("Fuego", "Tierra"), 70, 100, 70, 75, 40, 3));
        pokemonList.add(new Pokemon(324, "Torkoal", List.of("Fuego"), 70, 85, 140, 85, 20, 3));
        pokemonList.add(new Pokemon(325, "Spoink", List.of("Psíquico"), 60, 25, 35, 70, 80, 3));
        pokemonList.add(new Pokemon(326, "Grumpig", List.of("Psíquico"), 80, 45, 65, 80, 110, 3));
        pokemonList.add(new Pokemon(327, "Spinda", List.of("Normal"), 60, 60, 60, 60, 60, 3));
        pokemonList.add(new Pokemon(328, "Trapinch", List.of("Tierra"), 45, 100, 45, 10, 45, 3));
        pokemonList.add(new Pokemon(329, "Vibrava", List.of("Tierra", "Volador"), 50, 70, 50, 50, 65, 3));
        pokemonList.add(new Pokemon(330, "Flygon", List.of("Tierra", "Volador"), 80, 100, 80, 80, 100, 3));
        pokemonList.add(new Pokemon(331, "Cacnea", List.of("Planta"), 50, 85, 40, 40, 70, 3));
        pokemonList.add(new Pokemon(332, "Cacturne", List.of("Planta", "Siniestro"), 70, 115, 60, 60, 55, 3));
        pokemonList.add(new Pokemon(333, "Swablu", List.of("Normal", "Volador"), 45, 40, 50, 55, 75, 3));
        pokemonList.add(new Pokemon(334, "Altaria", List.of("Dragón", "Volador"), 75, 70, 60, 70, 80, 3));
        pokemonList.add(new Pokemon(335, "Zangoose", List.of("Normal"), 73, 115, 60, 60, 90, 3));
        pokemonList.add(new Pokemon(336, "Seviper", List.of("Veneno"), 73, 100, 60, 60, 65, 3));
        pokemonList.add(new Pokemon(337, "Lunatone", List.of("Roca", "Psíquico"), 90, 55, 65, 70, 95, 3));
        pokemonList.add(new Pokemon(338, "Solrock", List.of("Roca", "Psíquico"), 90, 95, 85, 55, 70, 3));
        pokemonList.add(new Pokemon(339, "Barboach", List.of("Agua", "Tierra"), 50, 48, 43, 46, 40, 3));
        pokemonList.add(new Pokemon(340, "Whiscash", List.of("Agua", "Tierra"), 130, 78, 73, 76, 60, 3));
        pokemonList.add(new Pokemon(341, "Corphish", List.of("Agua"), 43, 80, 50, 65, 35, 3));
        pokemonList.add(new Pokemon(342, "Crawdaunt", List.of("Agua", "Siniestro"), 63, 120, 85, 90, 55, 3));
        pokemonList.add(new Pokemon(343, "Baltoy", List.of("Roca", "Psíquico"), 40, 40, 55, 40, 55, 3));
        pokemonList.add(new Pokemon(344, "Claydol", List.of("Roca", "Psíquico"), 60, 70, 105, 70, 80, 3));
        pokemonList.add(new Pokemon(345, "Lileep", List.of("Planta", "Roca"), 66, 41, 77, 61, 23, 3));
        pokemonList.add(new Pokemon(346, "Cradily", List.of("Planta", "Roca"), 86, 81, 97, 107, 43, 3));
        pokemonList.add(new Pokemon(347, "Anorith", List.of("Bicho", "Roca"), 45, 95, 50, 40, 30, 3));
        pokemonList.add(new Pokemon(348, "Armaldo", List.of("Bicho", "Roca"), 75, 125, 100, 70, 45, 3));
        pokemonList.add(new Pokemon(349, "Feebas", List.of("Agua"), 20, 15, 20, 10, 80, 3));
        pokemonList.add(new Pokemon(350, "Milotic", List.of("Agua"), 130, 65, 79, 100, 81, 3));
        pokemonList.add(new Pokemon(339, "Barboach", List.of("Agua", "Tierra"), 50, 48, 43, 46, 40, 3));
        pokemonList.add(new Pokemon(340, "Whiscash", List.of("Agua", "Tierra"), 130, 78, 73, 76, 60, 3));
        pokemonList.add(new Pokemon(341, "Corphish", List.of("Agua"), 43, 80, 50, 65, 35, 3));
        pokemonList.add(new Pokemon(342, "Crawdaunt", List.of("Agua", "Siniestro"), 63, 120, 85, 90, 55, 3));
        pokemonList.add(new Pokemon(343, "Baltoy", List.of("Roca", "Psíquico"), 40, 40, 55, 40, 55, 3));
        pokemonList.add(new Pokemon(344, "Claydol", List.of("Roca", "Psíquico"), 60, 70, 105, 70, 80, 3));
        pokemonList.add(new Pokemon(345, "Lileep", List.of("Planta", "Roca"), 66, 41, 77, 61, 23, 3));
        pokemonList.add(new Pokemon(346, "Cradily", List.of("Planta", "Roca"), 86, 81, 97, 107, 43, 3));
        pokemonList.add(new Pokemon(347, "Anorith", List.of("Bicho", "Roca"), 45, 95, 50, 40, 30, 3));
        pokemonList.add(new Pokemon(348, "Armaldo", List.of("Bicho", "Roca"), 75, 125, 100, 70, 45, 3));
        pokemonList.add(new Pokemon(349, "Feebas", List.of("Agua"), 20, 15, 20, 10, 80, 3));
        pokemonList.add(new Pokemon(350, "Milotic", List.of("Agua"), 130, 65, 79, 100, 81, 3));
        pokemonList.add(new Pokemon(351, "Castform", List.of("Normal"), 70, 70, 70, 70, 70, 3));
        pokemonList.add(new Pokemon(352, "Kecleon", List.of("Normal"), 60, 90, 70, 60, 40, 3));
        pokemonList.add(new Pokemon(353, "Shuppet", List.of("Fantasma"), 44, 75, 35, 63, 45, 3));
        pokemonList.add(new Pokemon(354, "Banette", List.of("Fantasma"), 64, 115, 65, 83, 65, 3));
        pokemonList.add(new Pokemon(355, "Duskull", List.of("Fantasma"), 20, 40, 90, 30, 40, 3));
        pokemonList.add(new Pokemon(356, "Dusclops", List.of("Fantasma"), 40, 70, 130, 60, 60, 3));
        pokemonList.add(new Pokemon(357, "Tropius", List.of("Planta", "Volador"), 99, 68, 83, 72, 87, 3));
        pokemonList.add(new Pokemon(358, "Chimecho", List.of("Psíquico"), 65, 50, 70, 95, 80, 3));
        pokemonList.add(new Pokemon(359, "Absol", List.of("Siniestro"), 65, 130, 60, 75, 60, 3));
        pokemonList.add(new Pokemon(360, "Wynaut", List.of("Psíquico"), 95, 23, 48, 23, 23, 3));
        pokemonList.add(new Pokemon(361, "Snorunt", List.of("Hielo"), 50, 50, 50, 50, 50, 3));
        pokemonList.add(new Pokemon(362, "Glalie", List.of("Hielo"), 80, 80, 80, 80, 80, 3));
        pokemonList.add(new Pokemon(363, "Spheal", List.of("Agua", "Hielo"), 70, 40, 50, 55, 50, 3));
        pokemonList.add(new Pokemon(364, "Sealeo", List.of("Agua", "Hielo"), 90, 60, 70, 75, 60, 3));
        pokemonList.add(new Pokemon(365, "Walrein", List.of("Agua", "Hielo"), 110, 80, 90, 95, 65, 3));
        pokemonList.add(new Pokemon(366, "Clamperl", List.of("Agua"), 35, 74, 55, 50, 40, 3));
        pokemonList.add(new Pokemon(367, "Huntail", List.of("Agua"), 91, 104, 105, 52, 40, 3));
        pokemonList.add(new Pokemon(368, "Gorebyss", List.of("Agua"), 90, 84, 105, 140, 60, 3));
        pokemonList.add(new Pokemon(369, "Relicanth", List.of("Agua", "Roca"), 100, 90, 130, 65, 45, 3));
        pokemonList.add(new Pokemon(370, "Luvdisc", List.of("Agua"), 43, 30, 55, 40, 97, 3));
        pokemonList.add(new Pokemon(371, "Bagon", List.of("Dragón"), 45, 75, 60, 40, 30, 3));
        pokemonList.add(new Pokemon(372, "Shelgon", List.of("Dragón"), 65, 95, 100, 60, 50, 3));
        pokemonList.add(new Pokemon(373, "Salamence", List.of("Dragón", "Volador"), 95, 135, 80, 110, 100, 3));
        pokemonList.add(new Pokemon(374, "Beldum", List.of("Acero", "Psíquico"), 40, 55, 80, 35, 30, 3));
        pokemonList.add(new Pokemon(375, "Metang", List.of("Acero", "Psíquico"), 60, 75, 100, 55, 35, 3));
        pokemonList.add(new Pokemon(376, "Metagross", List.of("Acero", "Psíquico"), 80, 135, 130, 95, 70, 3));
        pokemonList.add(new Pokemon(377, "Regirock", List.of("Acero"), 80, 75, 150, 75, 40, 3));
        pokemonList.add(new Pokemon(378, "Regice", List.of("Hielo"), 80, 50, 50, 100, 200, 3));
        pokemonList.add(new Pokemon(379, "Registeel", List.of("Roca"), 80, 100, 200, 50, 50, 3));
        pokemonList.add(new Pokemon(380, "Latias", List.of("Dragón", "Psíquico"), 80, 80, 70, 110, 140, 3));
        pokemonList.add(new Pokemon(381, "Latios", List.of("Dragón", "Psíquico"), 80, 90, 80, 130, 110, 3));
        pokemonList.add(new Pokemon(382, "Kyogre", List.of("Agua"), 220, 130, 90, 160, 110, 3));
        pokemonList.add(new Pokemon(383, "Groudon", List.of("Tierra"), 220, 150, 140, 100, 90, 3));
        pokemonList.add(new Pokemon(384, "Rayquaza", List.of("Dragón", "Volador"), 105, 150, 90, 150, 95, 3));
        pokemonList.add(new Pokemon(385, "Jirachi", List.of("Acero", "Psíquico"), 100, 100, 100, 100, 100, 3));
        pokemonList.add(new Pokemon(386, "Deoxys", List.of("Psíquico"), 50, 180, 20, 180, 150, 3));


        return pokemonList;
    }

    public List<Pokemon> generarCuartaGen() {
        List<Pokemon> pokemonList = new ArrayList<>();

        pokemonList.add(new Pokemon(387, "Turtwig", List.of("Planta"), 55, 68, 55, 48, 31, 4));
        pokemonList.add(new Pokemon(388, "Grotle", List.of("Planta"), 75, 89, 70, 65, 36, 4));
        pokemonList.add(new Pokemon(389, "Torterra", List.of("Planta", "Tierra"), 95, 109, 105, 75, 56, 4));
        pokemonList.add(new Pokemon(390, "Chimchar", List.of("Fuego"), 44, 58, 44, 58, 61, 4));
        pokemonList.add(new Pokemon(391, "Monferno", List.of("Fuego", "Lucha"), 64, 78, 52, 64, 81, 4));
        pokemonList.add(new Pokemon(392, "Infernape", List.of("Fuego", "Lucha"), 76, 104, 71, 104, 108, 4));
        pokemonList.add(new Pokemon(393, "Piplup", List.of("Agua"), 53, 51, 53, 53, 40, 4));
        pokemonList.add(new Pokemon(394, "Prinplup", List.of("Agua"), 64, 66, 68, 60, 50, 4));
        pokemonList.add(new Pokemon(395, "Empoleon", List.of("Agua", "Acero"), 84, 86, 88, 81, 60, 4));
        pokemonList.add(new Pokemon(396, "Starly", List.of("Normal", "Volador"), 40, 55, 30, 30, 60, 4));
        pokemonList.add(new Pokemon(397, "Staravia", List.of("Normal", "Volador"), 55, 75, 50, 40, 80, 4));
        pokemonList.add(new Pokemon(398, "Staraptor", List.of("Normal", "Volador"), 85, 120, 70, 50, 100, 4));
        pokemonList.add(new Pokemon(399, "Bidoof", List.of("Normal"), 50, 48, 50, 55, 31, 4));
        pokemonList.add(new Pokemon(400, "Bibarel", List.of("Normal", "Agua"), 79, 85, 60, 70, 40, 4));
        pokemonList.add(new Pokemon(401, "Kricketot", List.of("Bicho"), 37, 25, 41, 25, 40, 4));
        pokemonList.add(new Pokemon(402, "Kricketune", List.of("Bicho"), 77, 85, 51, 55, 65, 4));
        pokemonList.add(new Pokemon(403, "Shinx", List.of("Eléctrico"), 45, 65, 34, 40, 60, 4));
        pokemonList.add(new Pokemon(404, "Luxio", List.of("Eléctrico"), 60, 85, 49, 60, 70, 4));
        pokemonList.add(new Pokemon(405, "Luxray", List.of("Eléctrico"), 80, 120, 79, 95, 70, 4));
        pokemonList.add(new Pokemon(406, "Budew", List.of("Planta", "Veneno"), 40, 30, 35, 50, 55, 4));
        pokemonList.add(new Pokemon(407, "Roserade", List.of("Planta", "Veneno"), 60, 70, 65, 125, 90, 4));
        pokemonList.add(new Pokemon(408, "Cranidos", List.of("Roca"), 67, 125, 40, 30, 58, 4));
        pokemonList.add(new Pokemon(409, "Rampardos", List.of("Roca"), 95, 165, 60, 97, 58, 4));
        pokemonList.add(new Pokemon(410, "Shieldon", List.of("Roca", "Acero"), 30, 42, 118, 42, 30, 4));
        pokemonList.add(new Pokemon(411, "Bastiodon", List.of("Roca", "Acero"), 60, 52, 168, 47, 30, 4));
        pokemonList.add(new Pokemon(412, "Burmy", List.of("Bicho"), 40, 29, 45, 45, 36, 4));
        pokemonList.add(new Pokemon(413, "Wormadam", List.of("Bicho", "Planta"), 60, 59, 85, 79, 36, 4));
        pokemonList.add(new Pokemon(414, "Mothim", List.of("Bicho", "Volador"), 70, 94, 50, 50, 66, 4));
        pokemonList.add(new Pokemon(415, "Combee", List.of("Bicho", "Volador"), 30, 30, 30, 30, 70, 4));
        pokemonList.add(new Pokemon(416, "Vespiquen", List.of("Bicho", "Volador"), 70, 80, 102, 80, 40, 4));
        pokemonList.add(new Pokemon(417, "Pachirisu", List.of("Eléctrico"), 60, 45, 40, 35, 95, 4));
        pokemonList.add(new Pokemon(418, "Buizel", List.of("Agua"), 55, 65, 35, 60, 85, 4));
        pokemonList.add(new Pokemon(419, "Floatzel", List.of("Agua"), 85, 105, 55, 85, 55, 4));
        pokemonList.add(new Pokemon(420, "Cherubi", List.of("Planta"), 45, 35, 45, 62, 35, 4));
        pokemonList.add(new Pokemon(421, "Cherrim", List.of("Planta"), 70, 60, 70, 87, 85, 4));
        pokemonList.add(new Pokemon(422, "Shellos", List.of("Agua"), 76, 48, 48, 59, 34, 4));
        pokemonList.add(new Pokemon(423, "Gastrodon", List.of("Agua", "Tierra"), 111, 83, 68, 92, 39, 4));
        pokemonList.add(new Pokemon(424, "Ambipom", List.of("Normal"), 75, 100, 66, 60, 115, 4));
        pokemonList.add(new Pokemon(425, "Drifloon", List.of("Fantasma", "Volador"), 150, 60, 55, 45, 40, 4));
        pokemonList.add(new Pokemon(426, "Drifblim", List.of("Fantasma", "Volador"), 150, 70, 55, 80, 90, 4));
        pokemonList.add(new Pokemon(427, "Buneary", List.of("Normal"), 55, 66, 44, 44, 55, 4));
        pokemonList.add(new Pokemon(428, "Lopunny", List.of("Normal"), 65, 76, 84, 54, 105, 4));
        pokemonList.add(new Pokemon(429, "Mismagius", List.of("Fantasma"), 60, 60, 60, 105, 105, 4));
        pokemonList.add(new Pokemon(430, "Honchkrow", List.of("Siniestro", "Volador"), 100, 125, 52, 105, 52, 4));
        pokemonList.add(new Pokemon(431, "Glameow", List.of("Normal"), 49, 55, 42, 42, 85, 4));
        pokemonList.add(new Pokemon(432, "Purugly", List.of("Normal"), 71, 82, 64, 64, 112, 4));
        pokemonList.add(new Pokemon(433, "Chingling", List.of("Psíquico"), 45, 30, 50, 60, 70, 4));
        pokemonList.add(new Pokemon(434, "Stunky", List.of("Siniestro", "Veneno"), 63, 63, 47, 41, 74, 4));
        pokemonList.add(new Pokemon(435, "Skuntank", List.of("Siniestro", "Veneno"), 103, 93, 67, 71, 84, 4));
        pokemonList.add(new Pokemon(436, "Bronzor", List.of("Acero", "Psíquico"), 57, 24, 86, 24, 50, 4));
        pokemonList.add(new Pokemon(437, "Bronzong", List.of("Acero", "Psíquico"), 67, 89, 116, 79, 33, 4));
        pokemonList.add(new Pokemon(438, "Bonsly", List.of("Roca"), 50, 80, 95, 10, 30, 4));
        pokemonList.add(new Pokemon(439, "Mime Jr.", List.of("Psíquico", "Hielo"), 20, 25, 45, 70, 60, 4));
        pokemonList.add(new Pokemon(440, "Happiny", List.of("Normal"), 100, 5, 5, 15, 30, 4));
        pokemonList.add(new Pokemon(441, "Chatot", List.of("Normal", "Volador"), 76, 65, 45, 92, 91, 4));
        pokemonList.add(new Pokemon(442, "Spiritomb", List.of("Fantasma", "Siniestro"), 50, 92, 108, 92, 35, 4));
        pokemonList.add(new Pokemon(443, "Gible", List.of("Dragón", "Tierra"), 58, 70, 45, 40, 42, 4));
        pokemonList.add(new Pokemon(444, "Gabite", List.of("Dragón", "Tierra"), 68, 80, 65, 50, 82, 4));
        pokemonList.add(new Pokemon(445, "Garchomp", List.of("Dragón", "Tierra"), 108, 130, 95, 80, 102, 4));
        pokemonList.add(new Pokemon(446, "Munchlax", List.of("Normal"), 135, 85, 40, 40, 5, 4));
        pokemonList.add(new Pokemon(447, "Riolu", List.of("Lucha"), 40, 70, 40, 35, 60, 4));
        pokemonList.add(new Pokemon(448, "Lucario", List.of("Lucha", "Acero"), 70, 110, 70, 115, 90, 4));
        pokemonList.add(new Pokemon(449, "Hippopotas", List.of("Tierra"), 68, 72, 78, 38, 41, 4));
        pokemonList.add(new Pokemon(450, "Hippowdon", List.of("Tierra"), 108, 112, 118, 60, 47, 4));
        pokemonList.add(new Pokemon(451, "Skorupi", List.of("Bicho", "Veneno"), 40, 50, 90, 30, 65, 4));
        pokemonList.add(new Pokemon(452, "Drapion", List.of("Bicho", "Siniestro"), 60, 90, 110, 60, 95, 4));
        pokemonList.add(new Pokemon(453, "Croagunk", List.of("Veneno", "Lucha"), 48, 61, 40, 50, 50, 4));
        pokemonList.add(new Pokemon(454, "Toxicroak", List.of("Veneno", "Lucha"), 83, 106, 65, 86, 65, 4));
        pokemonList.add(new Pokemon(455, "Carnivine", List.of("Planta"), 61, 100, 72, 90, 40, 4));
        pokemonList.add(new Pokemon(456, "Finneon", List.of("Agua"), 49, 49, 56, 49, 61, 4));
        pokemonList.add(new Pokemon(457, "Lumineon", List.of("Agua"), 69, 69, 76, 69, 91, 4));
        pokemonList.add(new Pokemon(458, "Mantyke", List.of("Agua", "Volador"), 45, 20, 50, 60, 50, 4));
        pokemonList.add(new Pokemon(459, "Snover", List.of("Planta", "Hielo"), 60, 62, 50, 62, 34, 4));
        pokemonList.add(new Pokemon(460, "Abomasnow", List.of("Planta", "Hielo"), 90, 92, 75, 92, 60, 4));
        pokemonList.add(new Pokemon(461, "Weavile", List.of("Siniestro", "Hielo"), 70, 120, 65, 45, 125, 4));
        pokemonList.add(new Pokemon(462, "Magnezone", List.of("Eléctrico", "Acero"), 70, 70, 115, 130, 60, 4));
        pokemonList.add(new Pokemon(463, "Lickilicky", List.of("Normal"), 110, 85, 95, 60, 50, 4));
        pokemonList.add(new Pokemon(464, "Rhyperior", List.of("Tierra", "Roca"), 115, 140, 130, 55, 40, 4));
        pokemonList.add(new Pokemon(465, "Tangrowth", List.of("Planta"), 100, 100, 125, 40, 50, 4));
        pokemonList.add(new Pokemon(466, "Electivire", List.of("Eléctrico"), 75, 123, 67, 95, 95, 4));
        pokemonList.add(new Pokemon(467, "Magmortar", List.of("Fuego"), 75, 95, 67, 125, 83, 4));
        pokemonList.add(new Pokemon(468, "Togekiss", List.of("Hada", "Volador"), 85, 50, 95, 120, 80, 4));
        pokemonList.add(new Pokemon(469, "Yanmega", List.of("Bicho", "Volador"), 86, 95, 66, 110, 121, 4));
        pokemonList.add(new Pokemon(470, "Leafeon", List.of("Planta"), 65, 110, 60, 65, 95, 4));
        pokemonList.add(new Pokemon(471, "Glaceon", List.of("Hielo"), 65, 60, 110, 130, 95, 4));
        pokemonList.add(new Pokemon(472, "Gliscor", List.of("Tierra", "Volador"), 75, 95, 125, 45, 95, 4));
        pokemonList.add(new Pokemon(473, "Mamoswine", List.of("Hielo", "Tierra"), 110, 130, 80, 70, 80, 4));
        pokemonList.add(new Pokemon(474, "Porygon-Z", List.of("Normal"), 85, 80, 70, 135, 90, 4));
        pokemonList.add(new Pokemon(475, "Gallade", List.of("Psíquico", "Lucha"), 68, 125, 65, 65, 80, 4));
        pokemonList.add(new Pokemon(476, "Probopass", List.of("Roca", "Acero"), 60, 55, 145, 75, 40, 4));
        pokemonList.add(new Pokemon(477, "Dusknoir", List.of("Fantasma"), 45, 100, 70, 60, 45, 4));
        pokemonList.add(new Pokemon(478, "Froslass", List.of("Hielo", "Fantasma"), 70, 80, 70, 80, 110, 4));
        pokemonList.add(new Pokemon(479, "Rotom", List.of("Eléctrico", "Fantasma"), 50, 65, 107, 105, 86, 4));
        pokemonList.add(new Pokemon(480, "Uxie", List.of("Psíquico"), 75, 75, 130, 75, 130, 4));
        pokemonList.add(new Pokemon(481, "Mesprit", List.of("Psíquico"), 80, 105, 70, 105, 80, 4));
        pokemonList.add(new Pokemon(482, "Azelf", List.of("Psíquico"), 75, 125, 70, 125, 70, 4));
        pokemonList.add(new Pokemon(483, "Dialga", List.of("Acero", "Dragón"), 100, 120, 120, 150, 90, 4));
        pokemonList.add(new Pokemon(484, "Palkia", List.of("Agua", "Dragón"), 90, 120, 100, 150, 100, 4));
        pokemonList.add(new Pokemon(485, "Heatran", List.of("Fuego", "Acero"), 91, 90, 106, 130, 77, 4));
        pokemonList.add(new Pokemon(486, "Regigigas", List.of("Normal"), 110, 160, 110, 80, 100, 4));
        pokemonList.add(new Pokemon(487, "Giratina", List.of("Fantasma", "Dragón"), 150, 100, 120, 100, 90, 4));
        pokemonList.add(new Pokemon(488, "Cresselia", List.of("Psíquico"), 120, 70, 120, 75, 85, 4));
        pokemonList.add(new Pokemon(489, "Phione", List.of("Agua"), 80, 80, 80, 80, 80, 4));
        pokemonList.add(new Pokemon(490, "Manaphy", List.of("Agua"), 100, 100, 100, 100, 100, 4));
        pokemonList.add(new Pokemon(491, "Darkrai", List.of("Siniestro"), 70, 90, 90, 135, 125, 4));
        pokemonList.add(new Pokemon(492, "Shaymin", List.of("Planta", "Volador"), 100, 100, 100, 100, 100, 4));
        pokemonList.add(new Pokemon(493, "Arceus", List.of("Normal"), 120, 120, 120, 120, 120, 4));


        return pokemonList;
    }

}
