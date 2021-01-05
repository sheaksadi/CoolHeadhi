package me.sheak.sadi.coolmobs.mobhead;

import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.io.IOException;

public class Mob {


    public String sortmob(EntityType e,Entity ett) {
        String name = e.toString().replace(" ", "_");
        switch (name) {
            case "COW":
                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjNkNjIxMTAwZmVhNTg4MzkyMmU3OGJiNDQ4MDU2NDQ4Yzk4M2UzZjk3ODQxOTQ4YTJkYTc0N2Q2YjA4YjhhYiJ9fX0";
            case "CHICKEN":
                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDJhZjZlNTg0N2VlYTA5OWUxYjBhYjhjMjBhOWU1ZjNjNzE5MDE1OGJkYTU0ZTI4MTMzZDliMjcxZWMwY2I0YiJ9fX0";
            case "DONKEY":
                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGUyNWVlOTI3M2FkNTc5ZDQ0YmY0MDZmNmY2Mjk1NTg2NDgxZWExOThmZDU3MjA3NmNkMGM1ODgyZGE3ZTZjYyJ9fX0";
            case "CREEPER":
                Creeper creeper =(Creeper) ett;
                if(creeper.isPowered())
                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUxMWU0YTNkNWFkZDZhNTQ0OTlhYmFkMTBkNzk5ZDA2Y2U0NWNiYTllNTIwYWZkMjAwODYwOGE2Mjg4YjdlNyJ9fX0";

                return "costom2";
             case "BAT":
                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGEyOWM5ZWNlNDI4ZmEyMzM5NWFjMjAxOWJmMmQwMjc0NDA1MjlmMjUzM2ZjODIwMWU3YjNkYTBmNjBmMjAwNSJ9fX0";
             case "COD":
                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjI0NmUxOWIzMmNmNzg0NTQ5NDQ3ZTA3Yjk2MDcyZTFmNjU2ZDc4ZTkzY2NjYTU2Mzc0ODVlNjc0OTczNDY1MiJ9fX0";
             case "CAVE_SPIDER":
                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWY4NDNiYjdhOTg0ZTczNGFiNzZhODhjOWExYTBmNWE0MGJmNzk1MjQ4MDlhODUxMWJmMzJkMDU3NTI2ZjdmMyJ9fX0";
             case "BLAZE":
                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGVlMjNkYzdhMTBjNmE4N2VmOTM3NDU0YzBlOTRlZDQyYzIzYWE2NDFhOTFlZDg0NzBhMzA0MmQwNWM1MmM1MiJ9fX0";
             case "DOLPHIN":
                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGU5Njg4Yjk1MGQ4ODBiNTViN2FhMmNmY2Q3NmU1YTBmYTk0YWFjNmQxNmY3OGU4MzNmNzQ0M2VhMjlmZWQzIn19fQ";
             case "DROWNED":
                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzNmN2NjZjYxZGJjM2Y5ZmU5YTYzMzNjZGUwYzBlMTQzOTllYjJlZWE3MWQzNGNmMjIzYjNhY2UyMjA1MSJ9fX0";
            case "SQUID":
                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODM1MWI3ZDlhNGYzNmNmZTMxZmQ1OWQ4YzkwMGU0MTlhMTM1MTQ0MTA1ZTdhOTgxY2FhNWExNjhkY2ZmMzI1YiJ9fX0";

            case "STRIDER":
                Strider strider =(Strider) ett ;
                if (strider.isShivering())
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjcxMzA4NWE1NzUyN2U0NTQ1OWMzOGZhYTdiYjkxY2FiYjM4MWRmMzFjZjJiZjc5ZDY3YTA3MTU2YjZjMjMwOSJ9fX0";
                else
                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWM0MGZhZDFjMTFkZTllNjQyMmI0MDU0MjZlOWI5NzkwN2YzNWJjZTM0NWUzNzU4NjA0ZDNlN2JlN2RmODg0In19fQ";

            case "IRON_GOLEM":
                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmU3YzA3MTlmYWJlMTE2ZGNlNjA1MTk5YmNhZGM2OWE1Mzg4NjA4NjRlZjE1NzA2OTgzZmY2NjI4MjJkOWZlMyJ9fX0";

            case "SPIDER":
                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTBjNDEwMDQ1Y2QzNzQ5YzNhOGVkODU2ZGY0MTFmNmMzM2U5YThhNmY5ZTU3ZTUyMTYwOGE4YWQ4ZWQ2ZWIzNyJ9fX0";

            case "ENDERMAN":
                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E1OWJiMGE3YTMyOTY1YjNkOTBkOGVhZmE4OTlkMTgzNWY0MjQ1MDllYWRkNGU2YjcwOWFkYTUwYjljZiJ9fX0";

            case "VILLAGER":
                Villager villager =(Villager)ett;
                if(villager.getProfession().toString()=="LIBRARIAN")
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2RjYWE1NzRiYWJiNDBlZTBmYTgzZjJmZDVlYTIwY2ZmMzFmZmEyNzJmZTExMzU4OGNlZWU0Njk2ODIxMjhlNyJ9fX0";

                if(villager.getProfession().toString()== "ARMORER")
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWVmNjI3ZjU2NmFjMGE3ODI4YmFkOTNlOWU0Yjk2NDNkOTlhOTI4YTEzZDVmOTc3YmY0NDFlNDBkYjEzMzZiZiJ9fX0";

                if(villager.getProfession().toString()== "BUTCHER")
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTFiYWQ2NDE4NWUwNGJmMWRhZmUzZGE4NDkzM2QwMjU0NWVhNGE2MzIyMWExMGQwZjA3NzU5MTc5MTEyYmRjMiJ9fX0";

                if(villager.getProfession().toString()== "CARTOGRAPHER")
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTNhZWNmYmU4MDFjZjMyYjVkMWIwYjFmNjY4MDA0OTY2NjE1ODY3OGM1M2Y0YTY1MWZjODNlMGRmOWQzNzM4YiJ9fX0";

                if(villager.getProfession().toString()== "CLERIC")
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWI5ZTU4MmUyZjliODlkNTU2ZTc5YzQ2OTdmNzA2YjFkZDQ5MjllY2FlM2MwN2VlOTBiZjFkNWJlMzE5YmY2ZiJ9fX0";

                if(villager.getProfession().toString()== "FARMER")
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDkyNzJkMDNjZGE2MjkwZTRkOTI1YTdlODUwYTc0NWU3MTFmZTU3NjBmNmYwNmY5M2Q5MmI4ZjhjNzM5ZGIwNyJ9fX0";

                if(villager.getProfession().toString()== "FISHERMAN")
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDE4OWZiNGFjZDE1ZDczZmYyYTU4YTg4ZGYwNDY2YWQ5ZjRjMTU0YTIwMDhlNWM2MjY1ZDVjMmYwN2QzOTM3NiJ9fX0";

                if(villager.getProfession().toString()== "FLETCHER")
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmY2MTFmMTJlMThjZTQ0YTU3MjM4ZWVmMWNhZTAzY2Q5ZjczMGE3YTQ1ZTBlYzI0OGYxNGNlODRlOWM0ODA1NiJ9fX0";

                if(villager.getProfession().toString()== "LEATHERWORKER")
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWUwZTk1OTFlMTFhYWVmNGMyYzUxZDlhYzY5NTE0ZTM0MDQ4NWRlZmNjMmMxMmMzOGNkMTIzODZjMmVjNmI3OCJ9fX0";

                if(villager.getProfession().toString()== "MASON")
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWUwZTk1OTFlMTFhYWVmNGMyYzUxZDlhYzY5NTE0ZTM0MDQ4NWRlZmNjMmMxMmMzOGNkMTIzODZjMmVjNmI3OCJ9fX0";

                if(villager.getProfession().toString()== "NITWIT")
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWUwZTk1OTFlMTFhYWVmNGMyYzUxZDlhYzY5NTE0ZTM0MDQ4NWRlZmNjMmMxMmMzOGNkMTIzODZjMmVjNmI3OCJ9fX0";

                if(villager.getProfession().toString()== "NONE")
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWUwZTk1OTFlMTFhYWVmNGMyYzUxZDlhYzY5NTE0ZTM0MDQ4NWRlZmNjMmMxMmMzOGNkMTIzODZjMmVjNmI3OCJ9fX0";

                if(villager.getProfession().toString()== "SHEPHERD")
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmFiZjRlOTE1NGFjOTI3MTk0MWM3MzNlYWNjNjJkYzlmYzBhNmRjMWI1ZDY3Yzc4Y2E5OGFmYjVjYjFiZTliMiJ9fX0";
                if(villager.getProfession().toString()== "TOOLSMITH")
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWUwZTk1OTFlMTFhYWVmNGMyYzUxZDlhYzY5NTE0ZTM0MDQ4NWRlZmNjMmMxMmMzOGNkMTIzODZjMmVjNmI3OCJ9fX0";

                if(villager.getProfession().toString()== "WEAPONSMITH")
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODQ3NmZmYTQxMGJiZTdmYTcwOTA5OTY1YTEyNWY0YTRlOWE0ZmIxY2UxYjhiM2MzNGJmYjczYWFmZmQ0Y2U0MyJ9fX0";


                return null;

            case "PIG":
                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDFlZTc2ODFhZGYwMDA2N2YwNGJmNDI2MTFjOTc2NDEwNzVhNDRhZTJiMWMwMzgxZDVhYzZiMzI0NjIxMWJmZSJ9fX0";

            case "BEE":
                Bee bee=(Bee)ett;
                if(bee.hasNectar()&&(bee.getAnger()!=0))
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTZiNzRlMDUyYjc0Mjg4Nzk5YmE2ZDlmMzVjNWQwMjIxY2Y4YjA0MzMxNTQ3ZWMyZjY4ZDczNTk3YWUyYzliIn19fQ";

                if(bee.getAnger()!=0)
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTQwMDIyM2YxZmE1NDc0MWQ0MjFkN2U4MDQ2NDA5ZDVmM2UxNWM3ZjQzNjRiMWI3Mzk5NDAyMDhmM2I2ODZkNCJ9fX0";

                if(bee.hasNectar())
                    return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjcyN2QwYWIwM2Y1Y2QwMjJmODcwNWQzZjdmMTMzY2E0OTIwZWFlOGUxZTQ3YjUwNzQ0MzNhMTM3ZTY5MWU0ZSJ9fX0";

                return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTlhYzE2ZjI5NmI0NjFkMDVlYTA3ODVkNDc3MDMzZTUyNzM1OGI0ZjMwYzI2NmFhMDJmMDIwMTU3ZmZjYTczNiJ9fX0";

            case "ZOMBIE":
                return "costom1";

            case "SKELETON":
                return "costom3";

            case "SHEEP":
                Sheep sheep = (Sheep) ett;
                String s =null ;

                if(sheep.getColor().toString().equalsIgnoreCase("WHITE")  )
                    s= "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmRmZTdjYzQ2ZDc0OWIxNTMyNjFjMWRjMTFhYmJmMmEzMTA4ZWExYmEwYjI2NTAyODBlZWQxNTkyZGNmYzc1YiJ9fX0";

                if(sheep.getColor().toString().equalsIgnoreCase("BLACK") )
                    s= "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTMzMzVlODA2NWM3YjVkZmVhNThkM2RmNzQ3NGYzOTZhZjRmYTBhMmJhNTJhM2M5YjdmYmE2ODMxOTI3MWM5MSJ9fX0";

                if(sheep.getColor().toString().equalsIgnoreCase("BLUE")  )
                    s= "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzQwZTI3N2RhNmMzOThiNzQ5YTMyZjlkMDgwZjFjZjRjNGVmM2YxZjIwZGQ5ZTVmNDIyNTA5ZTdmZjU5M2MwIn19fQ";

                if(sheep.getColor().toString().equalsIgnoreCase("BROWN") )
                    s= "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzEyOGQwODZiYzgxNjY5ZmMyMjU1YmIyMmNhZGM2NmEwZjVlZDcwODg1ZTg0YzMyZDM3YzFiNDg0ZGIzNTkwMSJ9fX0";

                if(sheep.getColor().toString().equalsIgnoreCase("CYAN") )
                    s= "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWQ0MmZjYmNhZjlkNDhmNzNmZmIwYzNjMzZmMzRiNDY0MzI5NWY2ZGFhNmNjNzRhYjlkMjQyZWQ1YWE1NjM2In19fQ";

                if(sheep.getColor().toString().equalsIgnoreCase("GRAY"))
                    s= "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2ZhZmVjZjA2MDNiMmRjZDc5ODRkMjUyNTg2MDY5ODk1ZGI5YWE3OGUxODQxYmQ1NTRiMTk1MDhkY2Y5NjdhMSJ9fX0";

                if(sheep.getColor().toString().equalsIgnoreCase("GREEN")  )
                    s= "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWVhODg3ZWFlNGIwNzYzNmU5ZTJmOTA2NjA5YjAwYWI4ZDliODZiNzQ3MjhiODE5ZmY2ZjM3NjU4M2VhMTM5In19fQ";

                if(sheep.getColor().toString().equalsIgnoreCase("LIGHT_BLUE")  )
                    s= "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWJmMjNhZjg3MTljNDM3YjNlZTg0MDE5YmEzYzllNjljYTg1NGQzYThhZmQ1Y2JhNmQ5Njk2YzA1M2I0ODYxNCJ9fX0";

                if(sheep.getColor().toString().equalsIgnoreCase("LIGHT_GRAY")  )
                    s= "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWQyZTJlOTNhMTQyYmZkNDNmMjQwZDM3ZGU4ZjliMDk3NmU3NmU2NWIyMjY1MTkwODI1OWU0NmRiNzcwZSJ9fX0";

                if(sheep.getColor().toString().equalsIgnoreCase("LIME")  )
                    s= "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmJlYWQwMzQyYWU4OWI4ZGZkM2Q3MTFhNjBhZGQ2NWUyYzJiZmVhOGQwYmQyNzRhNzU4N2RlZWQ3YTMxODkyZSJ9fX0";

                if(sheep.getColor().toString().equalsIgnoreCase("MAGENTA")  )
                    s= "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYThlMWYwNWYwZGFjY2E2M2E3MzE4NzRmOTBhNjkzZmZlMjFmZjgzMmUyYjFlMWQwN2I2NWM4NzY0NTI2ZjA4OSJ9fX0";

                if(sheep.getColor().toString().equalsIgnoreCase("ORANGE")  )
                    s= "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjY4NGQwNGZhODBhYTU5ZGExNDUzNWRlYWQzODgzZDA5N2ZiYmE0MDA2MjU2NTlmNTI1OTk2NDgwNmJhNjZmMCJ9fX0";

                if(sheep.getColor().toString().equalsIgnoreCase("PINK")  )
                    s= "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjM2M2U4YTkzZDI4N2E4NGU2NDAzMDlhZTgzY2ExZGUwYTBiMjU3NTA1YTIwZWM1NWIzMzQ5ZDQwYTQ0ODU0In19fQ";

                if(sheep.getColor().toString().equalsIgnoreCase("RED")  )
                    s= "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTQ3OGUwNTcxNThkZTZmNDVlMjU0MWNkMTc3ODhlNjQwY2NiNTk3MjNkZTU5YzI1NGU4MmFiNTcxMWYzZmMyNyJ9fX0";

                if(sheep.getColor().toString().equalsIgnoreCase("YELLOW")  )
                    s= "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTRiMjhmMDM1NzM1OTA2ZjgyZmZjNGRiYTk5YzlmMGI1NTI0MGU0MjZjZDFjNTI1YTlhYTc3MTgwZWVjNDkzNCJ9fX0";

                if(sheep.getColor().toString().equalsIgnoreCase("PURPLE")  )
                    s= "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ0OWQwODI5MWRhZTQ1YTI0NjczNjE5NjAyZjQzNWI1N2Y0Y2Q0ZTllOThkMmUwZmJlYzRmMTgxNDQ3ODFkMyJ9fX0";


                try {
                    if (sheep.getCustomName()=="jeb_")
                        s = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjMzMzI2NzY1YTE5MGViZjkwZDU0ODZkNzFmMjBlMjU5N2U0YmVlMmEzOTFmZWNiYmQ4MGRlYmZlMWY4MmQ3OCJ9fX0";
                }
                catch (NullPointerException i){

                }

                return s ;

            case "s":
                return "";

            case "gs":
                return "";

            case "":
                return "";



        }
        return null;
    }
}
