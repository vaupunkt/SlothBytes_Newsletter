# keyboardShortcut || Ctrl + C, Ctrl + V

Given a sentence containing few instances of "Ctrl + C" and "Ctrl + V", return the sentence after those keyboard shortcuts have been applied!

- "Ctrl + C" will copy all text behind it.

- "Ctrl + V" will do nothing if there is no "Ctrl + C" before it.

- A "Ctrl + C" which follows another "Ctrl + C" will overwrite what it copies.

```bash
#Example 1
keyboardShortcut("the egg and Ctrl + C Ctrl + V the spoon") output = "the egg and the egg and the spoon"

#Example 2
keyboardShortcut("WARNING Ctrl + V Ctrl + C Ctrl + V")
output=  "WARNING WARNING"

#Example 3
keyboardShortcut("The Ctrl + C Ctrl + V Town Ctrl + C Ctrl + V")
output = "The The Town The The Town"
```

## Notes
- Keyboard shortcut commands will appear like normal words in a sentence but shouldn't be copied themselves (see example #2).

- Pasting should add a space between words.

