# Phosphor icons importer

A ClojureScript/Node project for exporting the Phosphor icons to Vrac components.

The project is extracting the icons' SVG and their metadata directly from the npm package `@phosphor-icons/core`.

Update the version in `package.json` to export the latest icons.
See https://www.npmjs.com/package/@phosphor-icons/core

## Start a NodeJS REPL

Starts Shadow-CLJS, it will compile and stay in watch mode:

```bash
npm install
npm run dev
```

Then in a separate terminal, start the NodeJS runtime:
```bash
# outputs to ".." by default
node out/main.js <target-directory>
```

Then connect to Shadow's REPL server via the port file created,
and from there type `(shadow/repl :node)` to jack in tho the running NodeJS runtime.

## Run the export

In this project's folder:

```bash
npm install
npm run build

# outputs to ".." by default
node out/main.js <target-directory>
```

## Similar projects

- [Phosphor icons as Hiccup](https://github.com/cjohansen/phosphor-clj) by Christian Johansen.
