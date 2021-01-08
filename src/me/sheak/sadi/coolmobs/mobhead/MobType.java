package me.sheak.sadi.coolmobs.mobhead;


import org.bukkit.entity.EntityType;

public class MobType  {
    public String rsortmob(String url) {

        switch (url) {
            //// "COW"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjNkNjIxMTAwZmVhNTg4MzkyMmU3OGJiNDQ4MDU2NDQ4Yzk4M2UzZjk3ODQxOTQ4YTJkYTc0N2Q2YjA4YjhhYiJ9fX0":
                //// "CHICKEN"
                return "Cow Head";

            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDJhZjZlNTg0N2VlYTA5OWUxYjBhYjhjMjBhOWU1ZjNjNzE5MDE1OGJkYTU0ZTI4MTMzZDliMjcxZWMwY2I0YiJ9fX0":
                //// "DONKEY"
                return "Chiken head";
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGUyNWVlOTI3M2FkNTc5ZDQ0YmY0MDZmNmY2Mjk1NTg2NDgxZWExOThmZDU3MjA3NmNkMGM1ODgyZGE3ZTZjYyJ9fX0":
                //// "CREEPER"
                return "Donkey";
                //  Creeper creeper =(Creeper) :

                //  //(creeper.isPowered())
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUxMWU0YTNkNWFkZDZhNTQ0OTlhYmFkMTBkNzk5ZDA2Y2U0NWNiYTllNTIwYWZkMjAwODYwOGE2Mjg4YjdlNyJ9fX0":
                return "Powered Creeper Head";
                //   case  "costom2":
                //  // "BAT"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGEyOWM5ZWNlNDI4ZmEyMzM5NWFjMjAxOWJmMmQwMjc0NDA1MjlmMjUzM2ZjODIwMWU3YjNkYTBmNjBmMjAwNSJ9fX0":
                //  // "COD"
                return "Bat Head";
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjI0NmUxOWIzMmNmNzg0NTQ5NDQ3ZTA3Yjk2MDcyZTFmNjU2ZDc4ZTkzY2NjYTU2Mzc0ODVlNjc0OTczNDY1MiJ9fX0":
                //  // "CAVE_SPIDER"
                return "Cod Head";
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWY4NDNiYjdhOTg0ZTczNGFiNzZhODhjOWExYTBmNWE0MGJmNzk1MjQ4MDlhODUxMWJmMzJkMDU3NTI2ZjdmMyJ9fX0":
                //  // ""
                return "Cave Spider Head";
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGVlMjNkYzdhMTBjNmE4N2VmOTM3NDU0YzBlOTRlZDQyYzIzYWE2NDFhOTFlZDg0NzBhMzA0MmQwNWM1MmM1MiJ9fX0":
                // // "DOLPHIN"
                return "Blaze Head";
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGU5Njg4Yjk1MGQ4ODBiNTViN2FhMmNmY2Q3NmU1YTBmYTk0YWFjNmQxNmY3OGU4MzNmNzQ0M2VhMjlmZWQzIn19fQ":
                // // "DROWNED"
                return "Dolphin Head";
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzNmN2NjZjYxZGJjM2Y5ZmU5YTYzMzNjZGUwYzBlMTQzOTllYjJlZWE3MWQzNGNmMjIzYjNhY2UyMjA1MSJ9fX0":
                //  // "SQUID"
                return "Drowned Head";
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODM1MWI3ZDlhNGYzNmNmZTMxZmQ1OWQ4YzkwMGU0MTlhMTM1MTQ0MTA1ZTdhOTgxY2FhNWExNjhkY2ZmMzI1YiJ9fX0":
                return "Squid Head";
                //  // "STRIDER"

                //   Strider strider =(Strider)  :
                //     // (strider.isShivering())
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjcxMzA4NWE1NzUyN2U0NTQ1OWMzOGZhYTdiYjkxY2FiYjM4MWRmMzFjZjJiZjc5ZDY3YTA3MTU2YjZjMjMwOSJ9fX0":
                //     //shivering
                return "Shivering Strider Head";
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWM0MGZhZDFjMTFkZTllNjQyMmI0MDU0MjZlOWI5NzkwN2YzNWJjZTM0NWUzNzU4NjA0ZDNlN2JlN2RmODg0In19fQ":
                return "Strider Head";
                //  // "IRON_GOLEM"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmU3YzA3MTlmYWJlMTE2ZGNlNjA1MTk5YmNhZGM2OWE1Mzg4NjA4NjRlZjE1NzA2OTgzZmY2NjI4MjJkOWZlMyJ9fX0":
                return "Iron Golem Head";
                //  // "SPIDER"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTBjNDEwMDQ1Y2QzNzQ5YzNhOGVkODU2ZGY0MTFmNmMzM2U5YThhNmY5ZTU3ZTUyMTYwOGE4YWQ4ZWQ2ZWIzNyJ9fX0":
                return "Spider Head";
                //   // "ENDERMAN"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E1OWJiMGE3YTMyOTY1YjNkOTBkOGVhZmE4OTlkMTgzNWY0MjQ1MDllYWRkNGU2YjcwOWFkYTUwYjljZiJ9fX0":
                return "Enderman head";
                //   // "VILLAGER"
                //      Villager villager =(Villager):
                //      //(villager.getProfession().toString()=="LIBRARIAN")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2RjYWE1NzRiYWJiNDBlZTBmYTgzZjJmZDVlYTIwY2ZmMzFmZmEyNzJmZTExMzU4OGNlZWU0Njk2ODIxMjhlNyJ9fX0":
                return "Librerian's Head";
                //    //(villager.getProfession().toString()== "ARMORER")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWVmNjI3ZjU2NmFjMGE3ODI4YmFkOTNlOWU0Yjk2NDNkOTlhOTI4YTEzZDVmOTc3YmY0NDFlNDBkYjEzMzZiZiJ9fX0":
                return "Armorer's Head";
                //     //(villager.getProfession().toString()== "BUTCHER")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTFiYWQ2NDE4NWUwNGJmMWRhZmUzZGE4NDkzM2QwMjU0NWVhNGE2MzIyMWExMGQwZjA3NzU5MTc5MTEyYmRjMiJ9fX0":
                return "Butcher's Head";
                //    //(villager.getProfession().toString()== "CARTOGRAPHER")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTNhZWNmYmU4MDFjZjMyYjVkMWIwYjFmNjY4MDA0OTY2NjE1ODY3OGM1M2Y0YTY1MWZjODNlMGRmOWQzNzM4YiJ9fX0":
                return "Cartographer's Head";
                //    //(villager.getProfession().toString()== "CLERIC")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWI5ZTU4MmUyZjliODlkNTU2ZTc5YzQ2OTdmNzA2YjFkZDQ5MjllY2FlM2MwN2VlOTBiZjFkNWJlMzE5YmY2ZiJ9fX0":
                return "Cleric's Head";
                //   //(villager.getProfession().toString()== "FARMER")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDkyNzJkMDNjZGE2MjkwZTRkOTI1YTdlODUwYTc0NWU3MTFmZTU3NjBmNmYwNmY5M2Q5MmI4ZjhjNzM5ZGIwNyJ9fX0":
                return "Farmer's Head";
                //    //(villager.getProfession().toString()== "FISHERMAN")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDE4OWZiNGFjZDE1ZDczZmYyYTU4YTg4ZGYwNDY2YWQ5ZjRjMTU0YTIwMDhlNWM2MjY1ZDVjMmYwN2QzOTM3NiJ9fX0":
                return "Fisherman's Head";
                //    //(villager.getProfession().toString()== "FLETCHER")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmY2MTFmMTJlMThjZTQ0YTU3MjM4ZWVmMWNhZTAzY2Q5ZjczMGE3YTQ1ZTBlYzI0OGYxNGNlODRlOWM0ODA1NiJ9fX0":
                return "Fletcher's Head";
                //   //(villager.getProfession().toString()== "LEATHERWORKER")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWUwZTk1OTFlMTFhYWVmNGMyYzUxZDlhYzY5NTE0ZTM0MDQ4NWRlZmNjMmMxMmMzOGNkMTIzODZjMmVjNmI3OCJ9fX0":
                return "Villeger's Head";
                //    //(villager.getProfession().toString()== "MASON")
          //  case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWUwZTk1OTFlMTFhYWVmNGMyYzUxZDlhYzY5NTE0ZTM0MDQ4NWRlZmNjMmMxMmMzOGNkMTIzODZjMmVjNmI3OCJ9fX0":
           //     return "Mason's Head";
                //    //(villager.getProfession().toString()== "NITWIT")
         //   case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWUwZTk1OTFlMTFhYWVmNGMyYzUxZDlhYzY5NTE0ZTM0MDQ4NWRlZmNjMmMxMmMzOGNkMTIzODZjMmVjNmI3OCJ9fX0":
         //       return "Nitwit's Head";
                //    //(villager.getProfession().toString()== "NONE")
          //  case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWUwZTk1OTFlMTFhYWVmNGMyYzUxZDlhYzY5NTE0ZTM0MDQ4NWRlZmNjMmMxMmMzOGNkMTIzODZjMmVjNmI3OCJ9fX0":
           //     return "Unemployed Villager's Head";
                //    //(villager.getProfession().toString()== "SHEPHERD")

            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmFiZjRlOTE1NGFjOTI3MTk0MWM3MzNlYWNjNjJkYzlmYzBhNmRjMWI1ZDY3Yzc4Y2E5OGFmYjVjYjFiZTliMiJ9fX0":
                //    //(villager.getProfession().toString()== "TOOLSMITH")
                return "Shepherd's Head";
           // case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWUwZTk1OTFlMTFhYWVmNGMyYzUxZDlhYzY5NTE0ZTM0MDQ4NWRlZmNjMmMxMmMzOGNkMTIzODZjMmVjNmI3OCJ9fX0":
             //   return "Toolsmith's Head";
                //    //(villager.getProfession().toString()== "WEAPONSMITH")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODQ3NmZmYTQxMGJiZTdmYTcwOTA5OTY1YTEyNWY0YTRlOWE0ZmIxY2UxYjhiM2MzNGJmYjczYWFmZmQ0Y2U0MyJ9fX0":
                return "Weponsmith's Head";

                //     case  null:

                //   // "PIG"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDFlZTc2ODFhZGYwMDA2N2YwNGJmNDI2MTFjOTc2NDEwNzVhNDRhZTJiMWMwMzgxZDVhYzZiMzI0NjIxMWJmZSJ9fX0":
                return "Pig Head";
                //  // "BEE"
                //      Bee bee=(Bee):
                //      //(bee.hasNectar()&&(bee.getAnger()!=0))
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTZiNzRlMDUyYjc0Mjg4Nzk5YmE2ZDlmMzVjNWQwMjIxY2Y4YjA0MzMxNTQ3ZWMyZjY4ZDczNTk3YWUyYzliIn19fQ":
                return "Angry Pollinated Bee Head Head";

            //     //(bee.getAnger()!=0)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTQwMDIyM2YxZmE1NDc0MWQ0MjFkN2U4MDQ2NDA5ZDVmM2UxNWM3ZjQzNjRiMWI3Mzk5NDAyMDhmM2I2ODZkNCJ9fX0":
                return "Angry Bee Head";
                //(bee.hasNectar())
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjcyN2QwYWIwM2Y1Y2QwMjJmODcwNWQzZjdmMTMzY2E0OTIwZWFlOGUxZTQ3YjUwNzQ0MzNhMTM3ZTY5MWU0ZSJ9fX0":
                return "Pollinated Bee Head";
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTlhYzE2ZjI5NmI0NjFkMDVlYTA3ODVkNDc3MDMzZTUyNzM1OGI0ZjMwYzI2NmFhMDJmMDIwMTU3ZmZjYTczNiJ9fX0":
                return "Bee Head";
                // "ZOMBIE"
           // case  "costom1":

                // "SKELETON"
          //  case  "costom3":

                // "SHEEP"


                //(sheep.getColor().toString().equalsIgnore//("WHITE")  )
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmRmZTdjYzQ2ZDc0OWIxNTMyNjFjMWRjMTFhYmJmMmEzMTA4ZWExYmEwYjI2NTAyODBlZWQxNTkyZGNmYzc1YiJ9fX0":
                return "White Sheep Head";
                //(sheep.getColor().toString().equalsIgnore//("BLACK") )
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTMzMzVlODA2NWM3YjVkZmVhNThkM2RmNzQ3NGYzOTZhZjRmYTBhMmJhNTJhM2M5YjdmYmE2ODMxOTI3MWM5MSJ9fX0":
                return "Black Sheep Head";
                //(sheep.getColor().toString().equalsIgnore//("BLUE")  )
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzQwZTI3N2RhNmMzOThiNzQ5YTMyZjlkMDgwZjFjZjRjNGVmM2YxZjIwZGQ5ZTVmNDIyNTA5ZTdmZjU5M2MwIn19fQ":
                return "Blue Sheep Head";
                //(sheep.getColor().toString().equalsIgnore//("BROWN") )
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzEyOGQwODZiYzgxNjY5ZmMyMjU1YmIyMmNhZGM2NmEwZjVlZDcwODg1ZTg0YzMyZDM3YzFiNDg0ZGIzNTkwMSJ9fX0":
                return "Brown Sheep Head";
                //(sheep.getColor().toString().equalsIgnore//("CYAN") )
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWQ0MmZjYmNhZjlkNDhmNzNmZmIwYzNjMzZmMzRiNDY0MzI5NWY2ZGFhNmNjNzRhYjlkMjQyZWQ1YWE1NjM2In19fQ":
                return "Cyan Sheep Head";
                //(sheep.getColor().toString().equalsIgnore//("GRAY"))
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2ZhZmVjZjA2MDNiMmRjZDc5ODRkMjUyNTg2MDY5ODk1ZGI5YWE3OGUxODQxYmQ1NTRiMTk1MDhkY2Y5NjdhMSJ9fX0":
                return "Gray Sheep Head";
                //(sheep.getColor().toString().equalsIgnore//("GREEN")  )
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWVhODg3ZWFlNGIwNzYzNmU5ZTJmOTA2NjA5YjAwYWI4ZDliODZiNzQ3MjhiODE5ZmY2ZjM3NjU4M2VhMTM5In19fQ":
                return "Green Sheep Head";                //(sheep.getColor().toString().equalsIgnore//("LIGHT_BLUE")  )
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWJmMjNhZjg3MTljNDM3YjNlZTg0MDE5YmEzYzllNjljYTg1NGQzYThhZmQ1Y2JhNmQ5Njk2YzA1M2I0ODYxNCJ9fX0":
                return "Light Blue Sheep Head";
                //(sheep.getColor().toString().equalsIgnore//("LIGHT_GRAY")  )
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWQyZTJlOTNhMTQyYmZkNDNmMjQwZDM3ZGU4ZjliMDk3NmU3NmU2NWIyMjY1MTkwODI1OWU0NmRiNzcwZSJ9fX0":
                return "Light Gray Sheep Head";
                //(sheep.getColor().toString().equalsIgnore//("LIME")  )
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmJlYWQwMzQyYWU4OWI4ZGZkM2Q3MTFhNjBhZGQ2NWUyYzJiZmVhOGQwYmQyNzRhNzU4N2RlZWQ3YTMxODkyZSJ9fX0":
                return "Lime Sheep Head";
                //(sheep.getColor().toString().equalsIgnore//("MAGENTA")  )
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYThlMWYwNWYwZGFjY2E2M2E3MzE4NzRmOTBhNjkzZmZlMjFmZjgzMmUyYjFlMWQwN2I2NWM4NzY0NTI2ZjA4OSJ9fX0":
                return "Magenta Sheep Head";
                //(sheep.getColor().toString().equalsIgnore//("ORANGE")  )
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjY4NGQwNGZhODBhYTU5ZGExNDUzNWRlYWQzODgzZDA5N2ZiYmE0MDA2MjU2NTlmNTI1OTk2NDgwNmJhNjZmMCJ9fX0":
                return "Orange Sheep Head";
                //(sheep.getColor().toString().equalsIgnore//("PINK")  )
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjM2M2U4YTkzZDI4N2E4NGU2NDAzMDlhZTgzY2ExZGUwYTBiMjU3NTA1YTIwZWM1NWIzMzQ5ZDQwYTQ0ODU0In19fQ":
                return "Pink Sheep Head";
                //(sheep.getColor().toString().equalsIgnore//("RED")  )
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTQ3OGUwNTcxNThkZTZmNDVlMjU0MWNkMTc3ODhlNjQwY2NiNTk3MjNkZTU5YzI1NGU4MmFiNTcxMWYzZmMyNyJ9fX0":
                return "Red Sheep Head";
                //(sheep.getColor().toString().equalsIgnore//("YELLOW")  )
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTRiMjhmMDM1NzM1OTA2ZjgyZmZjNGRiYTk5YzlmMGI1NTI0MGU0MjZjZDFjNTI1YTlhYTc3MTgwZWVjNDkzNCJ9fX0":
                return "Yellow Sheep Head";
                //(sheep.getColor().toString().equalsIgnore//("PURPLE")  )
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ0OWQwODI5MWRhZTQ1YTI0NjczNjE5NjAyZjQzNWI1N2Y0Y2Q0ZTllOThkMmUwZmJlYzRmMTgxNDQ3ODFkMyJ9fX0":
                return "Purple Sheep Head";
                //jeb
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjMzMzI2NzY1YTE5MGViZjkwZDU0ODZkNzFmMjBlMjU5N2U0YmVlMmEzOTFmZWNiYmQ4MGRlYmZlMWY4MmQ3OCJ9fX0":
                return "jeb_ Head";

                // "WANDERING_TRADER"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWYxMzc5YTgyMjkwZDdhYmUxZWZhYWJiYzcwNzEwZmYyZWMwMmRkMzRhZGUzODZiYzAwYzkzMGM0NjFjZjkzMiJ9fX0":
                return "Wandering Trader Head";
                // "CAT"

                //(cat.getCatType()== Cat.Type.TABBY)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGUyOGQzMGRiM2Y4YzNmZTUwY2E0ZjI2ZjMwNzVlMzZmMDAzYWU4MDI4MTM1YThjZDY5MmYyNGM5YTk4YWUxYiJ9fX0":
                return "Tabby Cat Head";
                //(cat.getCatType()== Cat.Type.ALL_BLACK)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGZkMTBjOGU3NWY2NzM5OGM0NzU4N2QyNWZjMTQ2ZjMxMWMwNTNjYzVkMGFlYWI4NzkwYmNlMzZlZTg4ZjVmOCJ9fX0":
                return "Tuxedo Cat Head";
                //(cat.getCatType()== Cat.Type.RED)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjExM2RiZDNjNmEwNzhhMTdiNGVkYjc4Y2UwN2Q4MzZjMzhkYWNlNTAyN2Q0YjBhODNmZDYwZTdjYTdhMGZjYiJ9fX0":
                return "Red Cat Head";
                //(cat.getCatType()== Cat.Type.SIAMESE)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDViM2Y4Y2E0YjNhNTU1Y2NiM2QxOTQ0NDk4MDhiNGM5ZDc4MzMyNzE5NzgwMGQ0ZDY1OTc0Y2M2ODVhZjJlYSJ9fX0":
                return "Siamese Cat Head";
                //(cat.getCatType()== Cat.Type.BRITISH_SHORTHAIR)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTM4OWUwZDVkM2U4MWY4NGI1NzBlMjk3ODI0NGIzYTczZTVhMjJiY2RiNjg3NGI0NGVmNWQwZjY2Y2EyNGVlYyJ9fX0":
                return "British Shorthair Cat Head";
                //(cat.getCatType()== Cat.Type.CALICO)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQwMDk3MjcxYmI2ODBmZTk4MWU4NTllOGJhOTNmZWEyOGI4MTNiMTA0MmJkMjc3ZWEzMzI5YmVjNDkzZWVmMyJ9fX0":
                return "Calico Cat Head";
                //(cat.getCatType()== Cat.Type.PERSIAN)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmY0MGM3NDYyNjBlZjkxYzk2YjI3MTU5Nzk1ZTg3MTkxYWU3Y2UzZDVmNzY3YmY4Yzc0ZmFhZDk2ODlhZjI1ZCJ9fX0":
                return "Persian Cat Head";
                //(cat.getCatType()== Cat.Type.RAGDOLL)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM3YTQ1ZDI1ODg5ZTNmZGY3Nzk3Y2IyNThlMjZkNGU5NGY1YmMxM2VlZjAwNzk1ZGFmZWYyZTgzZTBhYjUxMSJ9fX0":
                return "Ragdoll Cat Head";
                //(cat.getCatType()== Cat.Type.WHITE)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjFkMTVhYzk1NThlOThiODlhY2E4OWQzODE5NTAzZjFjNTI1NmMyMTk3ZGQzYzM0ZGY1YWFjNGQ3MmU3ZmJlZCJ9fX0":
                return "White Cat Head";
                //(cat.getCatType()== Cat.Type.JELLIE)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTBkYjQxMzc2Y2E1N2RmMTBmY2IxNTM5ZTg2NjU0ZWVjZmQzNmQzZmU3NWU4MTc2ODg1ZTkzMTg1ZGYyODBhNSJ9fX0":
                return "Jelle Cat Head";
                //(cat.getCatType()== Cat.Type.BLACK)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjJjMWU4MWZmMDNlODJhM2U3MWUwY2Q1ZmJlYzYwN2UxMTM2MTA4OWFhNDdmMjkwZDQ2YzhhMmMwNzQ2MGQ5MiJ9fX0":
                return "Black Cat Head";



                // "ELDER_GUARDIAN"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGEyZDY0ZjRhMDBlOWM4NWY2NzI2MmVkY2FjYjg0NTIzNTgxYWUwZjM3YmRhYjIyZGQ3MDQ1MjRmNjJlMTY5ZiJ9fX0":
             return "Elder Guardian Head";
                // "ENDERMITE"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGM2YjY1YzIyYjQ0NjViYTY3OTNiMjE5NWNkNTA4NGNlODNiODhkY2E2ZTU1ZWI5NDg0NTQwYWNkNzM1MmE1MCJ9fX0":
                return "Endermite Head";
                // "EVOKER"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzkwZmJkODhmNjU5ZDM5NjNjNjhjYmJjYjdjNzEyMWQ4MTk1YThiZTY1YmJkMmJmMTI1N2QxZjY5YmNjYzBjNyJ9fX0":
                return "Evoker Head";
                // "FOX"

                //(fox.getFoxType()==Fox.Type.SNOW)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDE0MzYzNzdlYjRjNGI0ZTM5ZmIwZTFlZDg4OTlmYjYxZWUxODE0YTkxNjliOGQwODcyOWVmMDFkYzg1ZDFiYSJ9fX0":
                return "Arctic Fox Head";
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDdlMDA0MzExMWJjNTcwOTA4NTYyNTkxNTU1NzFjNzkwNmU3MDcwNDZkZjA0MWI4YjU3MjcwNGM0NTFmY2Q4MiJ9fX0":
                return "Fox Head";
                // "GHAST"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzUzZGUzMWEyZDAwNDFhNmVmNzViZjdhNmM4NDY4NDY0ZGIxYWFhNjIwMWViYjFhNjAxM2VkYjIyNDVjNzYwNyJ9fX0":
                return "Ghast Head";
                // "GUARDIAN"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJiYTM0NDE2NjcwNDU0YjFhMjA0OTZmODBiOTM5ODUyOWY0OTAwM2ZjNjEzZWI5MzAyNDhlYTliNWQxYTM5MSJ9fX0":
                return "Guardian Head";
                // "HOGLIN"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmM0YTdmNTdmYzAzYjEzYWEyZjlkODNjZGQ0ODIyYjkzNjc5MzA5NmRhZjUxZTc4MDI1YmJkMjQxZWQ2ZjY4ZCJ9fX0":
                return "Hoglin Head";
                // "HUSK"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzMzODMxOGJjOTFhMzZjZDVhYjZhYTg4NWM5YTRlZTJiZGFjZGFhNWM2NmIyYTk5ZGZiMGE1NjA5ODNmMjQ4MCJ9fX0":
                return "Husk Head";
                // "ILLUSIONER"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDM4MjcwMWM2N2Q2YzU0YzkwNzU1ODg5MWRjMTc2MjI1MTEyNTE4NzcxZTA2MWM1ZDhiZDkxODQ3OWU2YmRkOCJ9fX0":
                return "Illusioner Head";
                // "SHULKER"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI5ZTZhZjZiODE5ZjNkOTBlNjdjZTJlNzA1OWZiZWYzMWRhMmFhOTUzZDM1ZTM0NTRmMTAyMWZhOTEyZWZkZSJ9fX0":
                return "Shulker Head";
                // "HORSE"

                //(horse.getColor()==Horse.Color.WHITE)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzdiYzYxNjA5NzMwZjJjYjAxMDI2OGZhYjA4MjFiZDQ3MzUyNjk5NzUwYTE1MDU5OWYyMWMzZmM0ZTkyNTkxYSJ9fX0":
                return "White Horse Head";
                //(horse.getColor()==Horse.Color.BROWN)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjc3MTgwMDc3MGNiNGU4MTRhM2Q5MTE4NmZjZDc5NWVjODJlMDYxMDJmZjdjMWVlNGU1YzM4MDEwMmEwYzcwZiJ9fX0":
                return "Brown Horse Head";
                //(horse.getColor()==Horse.Color.CREAMY)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDJhMGQ1NGNjMDcxMjY3ZDZiZmQ1ZjUyM2Y4Yzg5ZGNmZGM1ZTgwNWZhYmJiNzYwMTBjYjNiZWZhNDY1YWE5NCJ9fX0":
                return "Creamy Horse Head";
                //(horse.getColor()==Horse.Color.CHESTNUT)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmM4NzIwZDFmNTUyNjkzYjQwYTlhMzNhZmE0MWNlZjA2YWZkMTQyODMzYmVkOWZhNWI4ODdlODhmMDVmNDlmYSJ9fX0":
                return "Chestnut Horse Head";
                //(horse.getColor()==Horse.Color.BLACK)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjcyM2ZhNWJlNmFjMjI5MmE3MjIzMGY1ZmQ3YWI2NjM0OTNiZDhmN2U2NDgxNjQyNGRjNWJmMjRmMTMzODkwYyJ9fX0":
                return "Black Horse Head";
                //(horse.getColor()==Horse.Color.GRAY)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzI1OTg2MTAyMTgxMDgzZmIzMTdiYzU3MTJmNzEwNGRhYTVhM2U4ODkyNjRkZmViYjkxNTlmNmUwOGJhYzkwYyJ9fX0":
                return "Gray Horse Head";
                //(horse.getColor()==Horse.Color.DARK_BROWN)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2YyMzQxYWFhMGM4MmMyMmJiYzIwNzA2M2UzMTkyOTEwOTdjNTM5YWRhZDlhYTkxM2ViODAwMWIxMWFhNTlkYSJ9fX0":
                return "Dark Brown Horse Head";


                // "LLAMA"

                //(llama.getColor()==Llama.Color.CREAMY)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGQ2N2ZkNGJmZjI5MzI2OWNiOTA4OTc0ZGNhODNjMzM0ODVlNDM1ZWQ1YThlMWRiZDY1MjFjNjE2ODcxNDA//X19":
                return "Creamy Llama Head";
                //(llama.getColor()==Llama.Color.WHITE)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODAyNzdlNmIzZDlmNzgxOWVmYzdkYTRiNDI3NDVmN2FiOWE2M2JhOGYzNmQ2Yjg0YTdhMjUwYzZkMWEzNThlYiJ9fX0":
                return "White Llama Head";
                //(llama.getColor()==Llama.Color.BROWN)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzJiMWVjZmY3N2ZmZTNiNTAzYzMwYTU0OGViMjNhMWEwOGZhMjZmZDY3Y2RmZjM4OTg1NWQ3NDkyMTM2OCJ9fX0":
                return "Brown Llama Head";
                //(llama.getColor()==Llama.Color.GRAY)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2YyNGU1NmZkOWZmZDcxMzNkYTZkMWYzZTJmNDU1OTUyYjFkYTQ2MjY4NmY3NTNjNTk3ZWU4MjI5OWE//X19":
                return "Gray Llama Head";
                // "MAGMA_CUBE"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjgxNzE4ZDQ5ODQ4NDdhNGFkM2VjMDgxYTRlYmZmZDE4Mzc0MzIzOWFlY2FiNjAzMjIxMzhhNzI2MDk4MTJjMyJ9fX0":

                // "MUSHROOM_COW"
               // MushroomCow mushroomCow=(MushroomCow):
                //(mushroomCow.getVariant()==MushroomCow.Variant.BROWN)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2U2NDY2MzAyYTVhYjQzOThiNGU0NzczNDk4MDhlNWQ5NDAyZWEzYWQ4ZmM0MmUyNDQ2ZTRiZWQwYTVlZDVlIn19fQ":
                return "Brown Mooshroom Head";
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGE4MDYwNmU4MmM2NDJmMTQxNTg3NzMzZTMxODBhZTU3ZjY0NjQ0MmM5ZmZmZDRlNTk5NzQ1N2UzNDMxMWEyOSJ9fX0":
                return "Mooshroom Head";                                             // "MULE"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDFjMjI0YTEwMzFiZTQzNGQyNWFlMTg4NWJmNGZmNDAwYzk4OTRjNjliZmVmNTZhNDkzNTRjNTYyNWMwYzA5YyJ9fX0":
                return "Mule Head";
                // "OCELOT"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTE3NWNjNDNlYThhZTIwMTY4YTFmMTcwODEwYjRkYTRkOWI0ZWJkM2M5OTc2ZTlmYzIyZTlmOTk1YzNjYmMzYyJ9fX0":
                return "Ocelot Head";
                // "PANDA"
             //   Panda panda=(Panda):
                //(panda.getMainGene()==Panda.Gene.AGGRESSIVE)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTU0NmU0MzZkMTY2YjE3ZjA1MjFiZDg1MzhlYTEzY2Q2ZWUzYjVkZjEwMmViMzJlM2U0MjVjYjI4NWQ0NDA2MyJ9fX0":
                return "Aggressive Panda Head";
                //(panda.getMainGene()==Panda.Gene.LAZY)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTg3ZjFmNWRiMmUyNGRmNGRhYWVkNDY4NWQ2YWVlNWRlYjdjZGQwMjk2MzBmMDA3OWMxZjhlMWY5NzQxYWNmZCJ9fX0":
                return "Lazy Panda Head";
                //(panda.getMainGene()==Panda.Gene.PLAYFUL)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGNhZGQ0YmYzYzRjYWNlOTE2NjgwZTFmZWY5MGI1ZDE2YWQ2NjQzOTUxNzI1NjY4YmE2YjQ5OTZiNjljYTE0MCJ9fX0":
                return "Playful Panda Head";
                //(panda.getMainGene()==Panda.Gene.WORRIED)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI4NmZkMWJmOGNiY2UyM2JjMDhmYjkwNjkxNzE3NjExYWRkYzg1YWI4MjNiNzcxNGFlYzk4YTU2NjBlZmYxNSJ9fX0":
                return "Worried Panda Head";
                //(panda.getMainGene()==Panda.Gene.BROWN)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWQ1ZjZkNjEyNjcyODY3MWI0NGMxYzc3NWY5OTYxNzQyNGUzMzYxMWI1ZDMxYWQyYWNmZjI4MDRlYjk2ZWIwNiJ9fX0":
                return "Brown Panda Head";
                //(panda.getMainGene()==Panda.Gene.WEAK)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2M1NmEzNTVmYmUwZTJmYmQyOGU4NWM0ZDgxNWZmYTVkMWY5ZDVmODc5OGRiYzI1OWZmODhjNGFkZGIyMDJhZSJ9fX0":
                return "Weak Panda Head";
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTlkZjQ3ZTAxNWQ1YzFjNjhkNzJiZTExYmI2NTYzODBmYzZkYjUzM2FhYjM4OTQxYTkxYjFkM2Q1ZTM5NjQ5NyJ9fX0":
                // "PARROT"
                return "Panda Head";
                //(parrot.getVariant()==Parrot.Variant.RED)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBhM2Q0N2Y1NGU3MWE1OGJmOGY1N2M1MjUzZmIyZDIxM2Y0ZjU1YmI3OTM0YTE5MTA0YmZiOTRlZGM3NmVhYSJ9fX0":
                return "Red Parrot Head";
                //(parrot.getVariant()==Parrot.Variant.BLUE)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjk0YmQzZmNmNGQ0NjM1NGVkZThmZWY3MzEyNmRiY2FiNTJiMzAxYTFjOGMyM2I2Y2RmYzEyZDYxMmI2MWJlYSJ9fX0":
                return "Blue Parrot Head";
                //(parrot.getVariant()==Parrot.Variant.GREEN)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmExZGMzMzExNTIzMmY4MDA4MjVjYWM5ZTNkOWVkMDNmYzE4YWU1NTNjMjViODA1OTUxMzAwMGM1OWUzNTRmZSJ9fX0":
                return "Green Parrot Head";
                //(parrot.getVariant()==Parrot.Variant.CYAN)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzI2OGNlMzdiZTg1MDdlZDY3ZTNkNDBiNjE3ZTJkNzJmNjZmOWQyMGIxMDZlZmIwOGU2YmEwNDFmOWI5ZWYxMCJ9fX0":
                return "Cyan Parrot Head";
                //(parrot.getVariant()==Parrot.Variant.GRAY)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzFiZTcyM2FhMTczOTNkOTlkYWRkYzExOWM5OGIyYzc5YzU0YjM1ZGViZTA1YzcxMzhlZGViOGQwMjU2ZGM0NiJ9fX0":
                return " Parrot Head";

                // "PHANTOM"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2U5NTE1M2VjMjMyODRiMjgzZjAwZDE5ZDI5NzU2ZjI0NDMxM2EwNjFiNzBhYzAzYjk3ZDIzNmVlNTdiZDk4MiJ9fX0":
                return "Phantom Head";
                // "PIGLIN"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODFhZmQ4NTM5MTE4MmE5ZjlkZTRmY2UyOWVhZjAyNTE0Y2MyZTA0NDgxNTc3ZGE1ZWRlYjU4YjE3ZTc1NzEzNSJ9fX0":
                return "Piglin Head";
                // "PIGLIN_BRUTE"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjQ4ODc5OWM4M2VjYjI5NDUyY2ViYTg5YzNjMDA5OTIxOTI3NGNlNWIyYmZiOGFkMGIzZWE0YzY1ZmFjNDYzMCJ9fX0":
                return "Piglin Brute Head";
                // "PILLAGER"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzIyNWYwYjQ5YzUyOTUwNDhhNDA5YzljNjAxY2NhNzlhYThlYjUyYWZmNWUyMDMzZWJiODY1ZjQzNjdlZjQzZSJ9fX0":
                return "Pilleger Head";
                // "POLAR_BEAR"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2Q4NzAyOTExZTYxNmMwZDMyZmJlNzc4ZDE5NWYyMWVjY2U5MDI1YmNiZDA5MTUxZTNkOTdhZjMxOTJhYTdlYyJ9fX0":
                return "Polar Bear Head";
                // "PUFFERFISH"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTI3MzNkNWRhNTljODJlYWYzMTBiMzgyYWZmNDBiZDUxM2M0NDM1NGRiYmFiZmUxNGIwNjZhNTU2ODEwYTdmOSJ9fX0":
                return "Pufferfish Head";


                // "RABBIT"
                //Rabbit rabbit=(Rabbit):

                //(rabbit.getRabbitType()==Rabbit.Type.BROWN)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2ZkNGY4NmNmNzQ3M2ZiYWU5M2IxZTA5MDQ4OWI2NGMwYmUxMjZjN2JiMTZmZmM4OGMwMDI0NDdkNWM3Mjc5NSJ9fX0":
                return "Brown Rabbit Head";
                //(rabbit.getRabbitType()==Rabbit.Type.WHITE)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTU0MmQ3MTYwOTg3MTQ4YTVkOGUyMGU0NjliZDliM2MyYTM5NDZjN2ZiNTkyM2Y1NWI5YmVhZTk5MTg1ZiJ9fX0":
                return "White Rabbit Head";
                //(rabbit.getRabbitType()==Rabbit.Type.BLACK)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjJiNDI1ZmYyYTIzNmFiMTljYzkzOTcxOTVkYjQwZjhmMTg1YjE5MWM0MGJmNDRiMjZlOTVlYWM5ZmI1ZWZhMyJ9fX0":
                return "Black Rabbit Head";
                //(rabbit.getRabbitType()==Rabbit.Type.BLACK_AND_WHITE)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzVmNzJhMjE5NWViZjQxMTdjNTA1NmNmZTJiNzM1N2VjNWJmODMyZWRlMTg1NmE3NzczZWU0MmEwZDBmYjNmMCJ9fX0":
                return "Black and White Rabbit Head";
                //(rabbit.getRabbitType()==Rabbit.Type.GOLD)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzY3YjcyMjY1NmZkZWVjMzk5NzRkMzM5NWM1ZTE4YjQ3YzVlMjM3YmNlNWJiY2VkOWI3NTUzYWExNGI1NDU4NyJ9fX0":
                return "Gold Rabbit Head";
                //(rabbit.getRabbitType()==Rabbit.Type.SALT_AND_PEPPER)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTIzODUxOWZmMzk4MTViMTZjNDA2MjgyM2U0MzE2MWZmYWFjOTY4OTRmZTA4OGIwMThlNmEyNGMyNmUxODFlYyJ9fX0":
                return "Salt and Paper Rabbit Head";
                //(rabbit.getRabbitType()==Rabbit.Type.THE_KILLER_BUNNY)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzFkZDc2NzkyOWVmMmZkMmQ0M2U4NmU4NzQ0YzRiMGQ4MTA4NTM0NzEyMDFmMmRmYTE4Zjk2YTY3ZGU1NmUyZiJ9fX0":
                return "killer Bunny Head";

            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTFhNTdjM2QwYTliMTBlMTNmNjZkZjc0MjAwY2I4YTZkNDg0YzY3MjIyNjgxMmQ3NGUyNWY2YzAyNzQxMDYxNiJ9fX0":
                return "Rabbit Head";
                // "RAVAGER"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWI0ZGIyOTg2MTQwZTI1MWUzMmU3MGVkMDhjOGEwODE3MjAzMTNjZTI1NzYzMmJlMWVmOTRhMDczNzM5NGRiIn19fQ":
                return "Ravager Head";
                // "SALMON"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzkxZDllNjliNzk1ZGE0ZWFhY2ZjZjczNTBkZmU4YWUzNjdmZWQ4MzM1NTY3MDZlMDQwMzM5ZGQ3ZmUwMjQwYSJ9fX0":
                return "Salmon Head";
                // "SILVERFISH"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjI1ZTlmYWUzNzE2NjRkZTFhODAwYzg0ZDAyNTEyNGFiYjhmMTUxMTE4MDdjOGJjMWFiOTEyNmFhY2JkNGY5NSJ9fX0":
                return "Silverfish Head";
                // "SKELETON_HORSE"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmUyMjY3MDViZDJhOWU3YmI4ZDZiMGY0ZGFhOTY5YjllMTJkNGFlNWM2NmRhNjkzYmI1ZjRhNGExZTZhYTI5NiJ9fX0":
                return "Skeleton Horse Head";
                // "SLIME"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzA2NDI0ZWM3YTE5NmIxNWY5YWQ1NzMzYTM2YTZkMWYyZTZhMGQ0MmZmY2UxZTE1MDhmOTBmMzEyYWM0Y2FlZCJ9fX0":
                return "Slime Head";
                // "SNOW_GOLEM"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2FhM2UxN2VmMWIyOWE0Yjg3ZmE0M2RlZTFkYjEyYzQxZmQzOWFhMzg3ZmExM2FmMmEwNzliNWIzNzhmZGU4YiJ9fX0":
                return "Snow Golem Head";
                // "STRAY"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTkyYjU1OTcwODVlMzVkYjUzZDliZGEwMDhjYWU3MmIyZjAwY2Q3ZDRjZDhkYzY5ZmYxNzRhNTViNjg5ZTZlIn19fQ":
                return "Stray Head";
               // "TRADER_LLAMA"
               // TraderLlama traderLlama =(TraderLlama):
                // (traderLlama.getColor()==Llama.Color.CREAMY)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTg5YTJlYjE3NzA1ZmU3MTU0YWIwNDFlNWM3NmEwOGQ0MTU0NmEzMWJhMjBlYTMwNjBlM2VjOGVkYzEwNDEyYyJ9fX0":
                return "Creamy Llama Head";
                // (traderLlama.getColor()==Llama.Color.WHITE)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzA4N2E1NTZkNGZmYTk1ZWNkMjg0NGYzNTBkYzQzZTI1NGU1ZDUzNWZhNTk2ZjU0MGQ3ZTc3ZmE2N2RmNDY5NiJ9fX0":
                return "White Llama Head";
                // (traderLlama.getColor()==Llama.Color.BROWN)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODQyNDc4MGIzYzVjNTM1MWNmNDlmYjViZjQxZmNiMjg5NDkxZGY2YzQzMDY4M2M4NGQ3ODQ2MTg4ZGI0Zjg0ZCJ9fX0":
                return "Brown Llama Head";
                // (traderLlama.getColor()==Llama.Color.GRAY)
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmU0ZDhhMGJjMTVmMjM5OTIxZWZkOGJlMzQ4MGJhNzdhOThlZTdkOWNlMDA3MjhjMGQ3MzNmMGEyZDYxNGQxNiJ9fX0":
                return "Gray Llama Head";
            //case  null:

                // "TROPICAL_FISH"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzRhMGM4NGRjM2MwOTBkZjdiYWZjNDM2N2E5ZmM2Yzg1MjBkYTJmNzNlZmZmYjgwZTkzNGQxMTg5ZWFkYWM0MSJ9fX0":
                return "Tropical Fish Head";
                // "TURTLE"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzA0OTMxMjAwYWQ0NjBiNjUwYTE5MGU4ZDQxMjI3YzM5OTlmYmViOTMzYjUxY2E0OWZkOWU1OTIwZDFmOGU3ZCJ9fX0":
                return "Turtle Head";
                // "VINDICATOR"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmRhYmFmZGUyN2VlMTJiMDk4NjUwNDdhZmY2ZjE4M2ZkYjY0ZTA0ZGFlMWMwMGNjYmRlMDRhZDkzZGNjNmM5NSJ9fX0":
                return "Vindicator Head";
                // "VEX"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGI4ZTE0ZWQzMTRlYTllYjQ0MTkzMjQxNTllZDA4ZTc3N2JhMTg3NWFkZTI5ODllYWEwZjUzMTBkYTc3MmU1NiJ9fX0":
                return "Vex Head";
                // "WITCH"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTUyMGYxMmM2M2M3OTEyMTg2YzRiZTRlMzBjMzNjNWFjYWVjMGRiMGI2YWJkODM2ZDUxN2Q3NGE2MjI3NWQ0YiJ9fX0":
                return "Witch Head";
                // "WITHER"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWRhMTA4MjhmNjNiN2VjZGVmZDc2N2IzMjQ1ZmJkYWExM2MzZWMwYzZiMTM3NzRmMWVlOGQzMDdjMDM0YzM4MyJ9fX0":
                return "Wither Head";

            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzE5NmViOGQ1OTljNGZlZjUzYTk3MTc2YjcyZmY4ZmM0MWUzMmE2NmExNTlmZDQ1MTkwYTBkYTE1NDU4N2UxMiJ9fX0":
                return "Invulnerable Wither Head";

            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjM3YzU4MTRhOTJmOGVjMGY2YWU5OTMzYWJlOTU0MmUxNjUxOTA3NjhlNzYwNDc4NTQzYWViZWVkNDAyN2MyNyJ9fX0":
                return "Armored Wither Head";

            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDM2ODJiMDYyMDNiOWRlNGMyODU0MTA3MWEyNmNkYzM0MGRkMjVkNGMzNzJiNzAyM2VjMmY0MTIwMjFkNjJmNyJ9fX0":
                return "Armored Invulnerable Wither Head";

                // "WOLF"

                //(wolf.isAngry())
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGQxYWE3ZTNiOTU2NGIzODQ2ZjFkZWExNGYxYjFjY2JmMzk5YmJiMjNiOTUyZGJkN2VlYzQxODAyYTI4OWM5NiJ9fX0":
                return "Angry wolf Head";
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjY0MzlhNDNlNTY4NzAwODgxNWEyZGQxZmY0YTEzNGMxMjIyMWI3ODIzMzY2NzhiOTc5YWQxM2RjZTM5NjY1ZSJ9fX0":
                return "Wolf Head";
                // "ZOGLIN"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmUzNDkzYTk1NmJmZDc1ODhlZDFhOGVhODU4NzU5NjY3NjU5ZDU4MTAwY2JlY2Q2ZDk2Y2NjMGNhOWIzNjkyMyJ9fX0":
                return "Zoglin Head";
                // "ZOMBIE_HORSE"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjYxOGZmYmUxY2ZhMjA1OGZlODBhMDY1ZjcwYzEyOGMyMjVhMWUwYmM5ZGVhZjhiMzhiMDM5NTQ0M2Y0MDkwOSJ9fX0":
                return "Zombie Horse Head";
                // "ZOMBIE_VILLAGER"
              //  ZombieVillager zvillager =(ZombieVillager) :


            // Needs some  fixing

                //(zvillager.getVillagerProfession() .toString()=="LIBRARIAN")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjIyMTFhMWY0MDljY2E0MjQ5YzcwZDIwY2E4MDM5OWZhNDg0NGVhNDE3NDU4YmU5ODhjYzIxZWI0Nzk3Mzc1ZSJ9fX0":
                return "Zombie Villager Head";
                //(zvillager.getVillagerProfession().toString()== "ARMORER")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzg2NzllMDM0NzY3ZDUxODY2MGQ5NDE2ZGM1ZWFmMzE5ZDY5NzY4MmFjNDBjODg2ZTNjMmJjOGRmYTFkZTFkIn19fQ":
                return "Zombie Villager Head";
                //(zvillager.getVillagerProfession().toString()== "BUTCHER")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWNjZThkNmNlNDEyNGNlYzNlODRhODUyZTcwZjUwMjkzZjI0NGRkYzllZTg1NzhmN2Q2ZDg5MjllMTZiYWQ2OSJ9fX0":
                return "Zombie Villager Head";
                //(zvillager.getVillagerProfession().toString()== "CARTOGRAPHER")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTYwODAwYjAxMDEyZTk2M2U3YzIwYzhiYTE0YjcwYTAyNjRkMTQ2YTg1MGRlZmZiY2E3YmZlNTEyZjRjYjIzZCJ9fX0":
                return "Zombie Villager Head";
                //(zvillager.getVillagerProfession().toString()== "CLERIC")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjk1ODU3OGJlMGUxMjE3MjczNGE3ODI0MmRhYjE0OTY0YWJjODVhYjliNTk2MzYxZjdjNWRhZjhmMTRhMGZlYiJ9fX0":
                return "Zombie Villager Head";
                //(zvillager.getVillagerProfession().toString()== "FARMER")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjc3ZDQxNWY5YmFhNGZhNGI1ZTA1OGY1YjgxYmY3ZjAwM2IwYTJjOTBhNDgzMWU1M2E3ZGJjMDk4NDFjNTUxMSJ9fX0":
                return "Zombie Villager Head";
                //(zvillager.getVillagerProfession().toString()== "FISHERMAN")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjkwNWQ1M2ZlNGZhZWIwYjMxNWE2ODc4YzlhYjgxYjRiZTUyYzMxY2Q0NzhjMDI3ZjBkN2VjZTlmNmRhODkxNCJ9fX0":
                return "Zombie Villager Head";
                //(zvillager.getVillagerProfession().toString()== "FLETCHER")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmVhMjZhYzBlMjU0OThhZGFkYTRlY2VhNThiYjRlNzZkYTMyZDVjYTJkZTMwN2VmZTVlNDIxOGZiN2M1ZWY4OSJ9fX0":
                return "Zombie Villager Head";
                //(zvillager.getVillagerProfession().toString()== "LEATHERWORKER")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI1NTJjOTBmMjEyZTg1NWQxMjI1NWQ1Y2Q2MmVkMzhiOWNkN2UzMGU3M2YwZWE3NzlkMTc2NDMzMGU2OTI2NCJ9fX0":
                return "Zombie Villager Head";
                //(zvillager.getVillagerProfession().toString()== "MASON")
           // case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI1NTJjOTBmMjEyZTg1NWQxMjI1NWQ1Y2Q2MmVkMzhiOWNkN2UzMGU3M2YwZWE3NzlkMTc2NDMzMGU2OTI2NCJ9fX0":

                //(zvillager.getVillagerProfession().toString()== "NITWIT")
           // case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI1NTJjOTBmMjEyZTg1NWQxMjI1NWQ1Y2Q2MmVkMzhiOWNkN2UzMGU3M2YwZWE3NzlkMTc2NDMzMGU2OTI2NCJ9fX0":

                //(zvillager.getVillagerProfession().toString()== "NONE")
           //case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI1NTJjOTBmMjEyZTg1NWQxMjI1NWQ1Y2Q2MmVkMzhiOWNkN2UzMGU3M2YwZWE3NzlkMTc2NDMzMGU2OTI2NCJ9fX0":

                //(zvillager.getVillagerProfession().toString()== "SHEPHERD")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjkxMzkxYmVmM2E0NmVmMjY3ZDNiNzE3MTA4NmJhNGM4ZDE3ZjJhNmIwZjgzZmEyYWMzMGVmZTkxNGI3YzI0OSJ9fX0":
                return "Zombie Villager Head";
                //(zvillager.getVillagerProfession().toString()== "TOOLSMITH")
           // case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI1NTJjOTBmMjEyZTg1NWQxMjI1NWQ1Y2Q2MmVkMzhiOWNkN2UzMGU3M2YwZWE3NzlkMTc2NDMzMGU2OTI2NCJ9fX0":

                //(zvillager.getVillagerProfession().toString()== "WEAPONSMITH")
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDM3MDg5NGI1Y2MzMDVkODdhYTA4YzNiNGIwODU4N2RiNjhmZjI5ZTdhM2VmMzU0Y2FkNmFiY2E1MGU1NTI4YiJ9fX0":
                return "Zombie Villager Head";

            //case  null:


                // "ZOMB//IED_PIGLIN"
            case  "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmRmMDMxMjhiMDAyYTcwNzA4ZDY4MjVlZDZjZjU0ZGRmNjk0YjM3NjZkNzhkNTY0OTAzMGIxY2I4YjM0YzZmYSJ9fX0":
                return "Zombifed Piglin Head";



/*

           */
        }
        return null;
    }
}
