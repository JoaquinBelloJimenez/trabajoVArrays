#!/bin/bash
echo "Escribe el comentario: "

read comentario

git add . --all
git commit -m "$comentario"
git push

echo ""
echo "Todo listo señor ;)"
