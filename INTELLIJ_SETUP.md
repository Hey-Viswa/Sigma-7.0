# IntelliJ IDEA Setup Instructions

## Opening the Project

1. **Open IntelliJ IDEA**
2. **Choose "Open"** from the welcome screen
3. **Navigate to and select** the `Sigma-7.0` folder
4. **Click "Open"** - IntelliJ will automatically detect the project structure

## Project Structure

The project is configured with:
- **Source Folders**: All topic folders (01_Arrays, 02_Strings, etc.) with their subfolders
- **Output Directory**: `bin/` (all compiled `.class` files go here)
- **Java Version**: Java 21 (compatible with your system)

## Running Java Files

### Method 1: Right-click Run
1. Open any `.java` file (e.g., `DeleteANode.java`)
2. Right-click in the editor
3. Select **"Run 'ClassName.main()'"**

### Method 2: Green Play Button
1. Open a Java file with a `main` method
2. Look for the green play button (▶️) next to the `main` method
3. Click it to run

### Method 3: Run Menu
1. Open a Java file
2. Go to **Run → Run...** (Ctrl+Shift+F10)
3. Select the class to run

## Compilation Output

- All compiled `.class` files will be placed in the `bin/` directory
- Your source folders remain clean
- The `bin/` directory is ignored by Git (in `.gitignore`)

## Troubleshooting

### If you get "SDK not configured" error:
1. Go to **File → Project Structure** (Ctrl+Alt+Shift+S)
2. Under **Project Settings → Project**
3. Set **Project SDK** to Java 21 (or your installed Java version)
4. Set **Project language level** to match your Java version

### If source folders are not recognized:
1. Go to **File → Project Structure**
2. Under **Modules → Sources**
3. Verify all topic folders are marked as **Source Folders** (blue folder icon)

### If output directory is wrong:
1. Go to **File → Project Structure**
2. Under **Project Settings → Project**
3. Set **Project compiler output** to the `bin` folder

## Features Available

✅ **Syntax Highlighting**
✅ **Code Completion**
✅ **Error Detection**
✅ **Debug Support**
✅ **Refactoring Tools**
✅ **Git Integration**
✅ **Run/Debug Configurations**

## Directory Structure

```
Sigma-7.0/
├── 01_Arrays/Basic/          ← Source folder
├── 02_Strings/Basic/         ← Source folder
├── 13_Binary_Search_Tree/Basic/ ← Source folder
├── 14_Heaps/Basic/           ← Source folder
├── ... (all other topics)
├── bin/                      ← Output directory (Git ignored)
├── .idea/                    ← IntelliJ project files
└── Apna College Sigma 7.0.iml ← Module file
```

Your project is now fully compatible with IntelliJ IDEA! 🎉
