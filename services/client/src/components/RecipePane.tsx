import React from "react";
import { Recipe } from "./Recipe";

export function RecipePane({recipe}: any) {
    return <div className="Recipe">
        <h1>{recipe.title}</h1>

        <p>Servings: {recipe.servings}</p>

        <p>Ingredients:</p>
        <ul>
          {Object.entries(recipe.ingredients).map(ing =>
              <li key={ing[0]}>{ing[0]}: {ing[1]}</li>
          )}
        </ul>

        <p>{recipe.directions}</p>

    </div>
}
