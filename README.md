# Cursor-Based Text Processor

This Java program processes lines of text according to specific cursor-based editing commands. Given an input string containing both text and command characters, the program interprets the commands to move a virtual cursor within the text, modify the text, or delete characters. The result is a transformed string based on the provided commands.

## Table of Contents

- [Overview](#overview)
- [Purpose](#purpose)
- [Features](#features)
- [Input Format](#input-format)
- [Example Input and Output](#example-input-and-output)
- [Explanation](#explanation)

---

## Overview

The program reads lines of input from standard input, applies a series of cursor movement and editing commands, and outputs the modified text. Each line is processed independently, with the cursor positioned at the beginning of each new line. This approach demonstrates handling character manipulation and cursor control within a text-processing context.

## Purpose

This project serves as a **learning exercise** in:
- Working with **lists** for dynamic text editing.
- **Cursor-based editing**: Implementing commands to move and manipulate text based on cursor positioning.
- **Switch statements and control structures**: Efficiently interpreting commands to modify text content.

## Features

- **Dynamic Cursor Movement**: The cursor can be moved to the beginning, end, or shifted right within the text.
- **Character Deletion**: Supports deletion at the current cursor position.
- **On-the-Fly Insertion**: Allows insertion of characters at any position based on cursor location.
- **Command Interpretation**: Processes special commands within the text to control cursor-based actions.

## Input Format

The input consists of one or more lines of text, where each line can contain:
- Regular characters to be inserted into the text.
- Special command characters:
  - **`-`**: Moves the cursor to the beginning of the text.
  - **`+`**: Moves the cursor to the end of the text.
  - **`*`**: Moves the cursor one position to the right.
  - **`3`**: Deletes the character at the cursor’s current position.

## Example Input and Output

### Input

```plaintext
hello-+
test*3
apple3-
```

### Output

```plaintext
hello
tst
pple
```

### Explanation

1. **Line 1**: The cursor moves to the beginning (`-`), then to the end (`+`). The output remains `"hello"`.
2. **Line 2**: `"test*3"` - The cursor moves right (`*`), then deletes the character `"e"` at the cursor (`3`), resulting in `"tst"`.
3. **Line 3**: `"apple3-"` - The character `"p"` is deleted (`3`), and the cursor moves to the start (`-`), resulting in `"pple"`.

## Explanation

The program processes each line character-by-character and interprets commands as follows:
- **Cursor Positioning**: Adjusts the cursor based on special command characters (`-`, `+`, `*`).
- **Insertion and Deletion**: Inserts non-command characters at the cursor location and deletes the character at the cursor if `3` is encountered.
- **List-Based Text Storage**: Uses an `ArrayList` to dynamically store and modify text, which allows efficient insertion, deletion, and cursor positioning.