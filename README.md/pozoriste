# Projekat5-Rezervisanje-Karata-za-Pozoriste
O program
   Program se koristi za rezervaciju karata za pozoriste.Podaci o Predstavam i pozoristu se nalaze u SQL bazi podataka.Korisnik pri Otvaranju Aplikacij mora da unese svoj username i password da bi nastavio sa daljim radom,Ako se ne unesu podaci ili se unesu pogresni podaci izlaze odgovarajuce poruke.Po uspesno logovanju korisnik dobija pristup formi za pretragu predstave po nazivu i mogucnost rezervacije karata.Rezervisane karte se pokazuju za loginovanog korisnika i korisnik moze da menje ili brise rezervaciju.

Baza podataka
Baza podataka izrađena je pomocu XAMPP Control Panela, korišćenjem phpMyAdmin panela.
U sebi ima 6 tabela koje predstavljau poslovni proces pozorista.
 ![image](https://user-images.githubusercontent.com/37869535/38040685-5415568c-32b0-11e8-8c68-6b5c1129fc72.png)


1.	Tabela „korisnik“
-	Sadrži podatke o korisniku
-	Podatke potrebne za proveru login podataka korisnika
-	Primary key: idKorisnik

2.	Tabela „korisnikrezervacija“
-	Sadrži podatke o rezervacijama količine karata pojedinog korisnika za određene predstave
-	Služi kao medjutabela za tabele „korisnik“ i „predstava“
-	Primary key: idkorisnikrezervacija
-	Fogen key: idKorisnik, idPredstava

3.	Tabela „predstava“
-	Sadrži podatke o predstavama, naziv predstave, datum i vreme početka predstave, te ceni karte za predstavu
-	Primary key: idPredstava
-	Fogen key: idPozoriste, idAutor, idZanr
        4.Tabela „pozoriste“
-	Sadrži podatke o pozorištu, naziv pozorišta, adresa te kapacitet mesta odnosno ukupne količine karata za predstave.
-	Primary key: idPozoriste

         5.Tabela „Autor“
-	Sadrži podatke o imenu i prezimenu autora/režisera predstave
-	Primary key: idAutor
6.Tabela „Zanr“
-	Sadrži podatak o žanru predstave, kao što je Drama, Komedija, Opera..
-	Primary key: idZanr
Program Korisnik deo
Program se sastoji od tri forme Dostupne Korisniku Logovanje,Registracija Korisnika i Rezervacija Forma 
Prva forma koja se otvara po pokretanju je logovanje,Gde Korisnik treba da uspesno unese svoj username i password da bi dobio dlaji pristup aplikaciji.Ukoliko se ne unesi podaci izlazi poruka podaci nisu uneti ukoliko su pogrsno uneti podaci izlazi poruka Greska podaci su pogresni.Ako Korisnik Nema Nalog ima opciju da se Registruje.  
![image](https://user-images.githubusercontent.com/37869535/38040697-5805209c-32b0-11e8-9526-e293eb02a1de.png)



Ako Korisnik nema nalog otvara Registracija Fromu.
![image](https://user-images.githubusercontent.com/37869535/38040707-5c5d920a-32b0-11e8-8532-de4380c50fa5.png)

 
Gde se vrsi provera da :username Korisnika vec ne postoji u bazi
                                         :da su sva polja uneta
                                           :da su password polja isto popunjena
                                         :da je e-mail sadrzi @;
Ako su svi uslovi ispunjeni korisnik se upisuje u bazu i ponov mu se otvara forma Logovanje;

Po uspesnom Logovanju Otvara se forma RegistracijForma gde Korisnik Moze da pretrazuje Predstavu po nazivu i da rezervise zeljen broj karata za predstavu.Po rezervaciji u tabelu 2 se upisiuju rerzervacije ime predstave,brojRezervisanihKarti,Cena Pojedninacne karte i Ukupna Cena.Korisniku se pokazuje i  ukupna cena svih karata i ima opciju da obrise ili izmeni rezervaciju.
 ![image](https://user-images.githubusercontent.com/37869535/38040718-5feefd32-32b0-11e8-81a7-a5437caa4d6b.png)

Program Admin deo
U Admin delu program imamo 6 formi
ponovo logovanje gde admin treba da unese “admin” “admin” kao username i password  time pristupa Medju Formi
![image](https://user-images.githubusercontent.com/37869535/38040720-630eb4da-32b0-11e8-8301-244337fec0b6.png)
 
Gde bira za koju formu zeli da menja podatke u svakoj od tih formi admin moze da dodao novi podatak,izbrise podatke ili izmeni podatke.
 ![image](https://user-images.githubusercontent.com/37869535/38040726-67bfba92-32b0-11e8-8012-1a9761f6f1d0.png)

![image](https://user-images.githubusercontent.com/37869535/38040733-6b2f2488-32b0-11e8-8f94-482d7828f0d6.png)

![image](https://user-images.githubusercontent.com/37869535/38040739-6ec2a318-32b0-11e8-88ef-163e543f60b3.png)
![image](https://user-images.githubusercontent.com/37869535/38040741-7317a29c-32b0-11e8-9d5f-40ebd523d7e6.png)
