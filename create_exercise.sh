#!/bin/bash
# create_exercise.sh <chapter> <section> <exercise_id>
mkdir -p "chapter-$1/$2"
filename="chapter-$1/$2/Exercise_$3.java"
cp common/ExerciseTemplate.java "$filename"
echo "Fichier créé : $filename"
