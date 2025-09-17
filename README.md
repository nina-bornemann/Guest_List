[![Java CI with Maven](https://github.com/nina-bornemann/Guest_List/actions/workflows/maven.yml/badge.svg)](https://github.com/nina-bornemann/Guest_List/actions/workflows/maven.yml)

## 📜 GuestList  

A simple Java class to manage a guest list.
Supports adding guests, saving the list to disk, and reading it back.

---

### 🚀 Features
- Add guests to a list
- Save the guest list to a file (.txt)
- Load a guest list from a file
- Equality and hashCode implemented for easy comparison in tests

---

### 🔧 Usage

Build
> mvn -B clean verify

Create and manage a guest list
> GuestList guestList = new GuestList();  
> guestList.addGuest("Alice");
> guestList.addGuest("Bob");

Save to disk
> Path path = Path.of("guests.txt");  
> guestList.saveToDisc(path);

Load from disk
> GuestList loadedList = GuestList.parseFromDisc(path);  

---

### ✅ Tests
- Adding guests
- Saving and loading from disk
- Correct equality comparison

Run the tests with:
> mvn test

---

### Requirements
- Java 24+
- Maven (optional, for testing and building)