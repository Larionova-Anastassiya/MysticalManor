# 🏰 Mystical Manor Adventure

> A small interactive console adventure created with **Kotlin/JVM**.

## ✨ About the Project

I created **Mystical Manor Adventure** as a Kotlin console application where the player wakes up inside a mysterious manor, chooses a character, explores rooms, enters magical paintings, collects items, unlocks achievements, and fights enemies.

The game has three playable character classes:

- 🎨 **Artist** — can discover the **Secret Gallery immediately** and uses a Magic Brush.
- 🧭 **Explorer** — has more health and specializes in exploration and hidden treasures.
- 🔮 **Mage** — has less health but deals stronger magical damage.

The player's choices affect exploration and combat. For example, other characters must explore the manor before discovering the Secret Gallery, while the Artist can access it from the beginning.

Inside the manor, the player can discover magical paintings such as **The Starry Night**, enter their worlds, encounter a **Shadow Guardian**, receive rewards, collect keys and treasures, and unlock achievements.

---

## 🎮 Main Features

- Character selection with different stats and abilities
- Manor exploration and secret areas
- Magical paintings and interactive objects
- Inventory and healing system
- Turn-based combat
- Gold and experience rewards
- Unique achievements
- Player statistics
- Coroutine-based painting transitions

---

## ▶️ How to Run

1. Open the project in **Android Studio** or **IntelliJ IDEA**.
2. Wait for Gradle synchronization to finish.
3. Open `src/main/kotlin/Main.kt`.
4. Run the `main()` function.
5. Use the console and enter numbers to choose actions.

The project is a **Kotlin/JVM console application** and does not use Activity, Fragment, Jetpack Compose, XML layouts, or other Android UI components.

---

## 🧩 Kotlin Requirements

| Requirement | Implementation |
|---|---|
| Variables, data types, conditions & loops | Player stats, menus, exploration and combat |
| `List` | Inventory, paintings and room objects |
| `Set` | Unique achievements |
| `Map` | Manor rooms |
| `map` | Getting item names and values |
| `filter` | Finding healing items |
| `reduce` | Calculating total inventory value |
| Functions | Exploration, combat, healing, events and statistics |
| Higher-order function & lambda | Inventory value processing |
| Classes & objects | Characters, rooms, enemies, paintings, items |
| Inheritance | `Character` → `Artist`, `Explorer`, `Mage` |
| Interface & polymorphism | `Interactable` → `Painting`, `TreasureChest` |
| Data class | `Item`, `Achievement` |
| Sealed class | `GameEvent` |
| Suspend function & coroutine | Entering and loading magical painting worlds |
| `main()` | Application entry point in `Main.kt` |

---

## 🛠 Built With

**Kotlin · Kotlin/JVM · Gradle · Kotlin Coroutines**

---

*Created as my Kotlin programming assignment to combine Kotlin collections, OOP, functional programming, and coroutines in one meaningful interactive application.*
