import React from "react";
import { Recipe } from "./Recipe";

export function RecipePane({recipe, handleClick}: any) {

    return <div className="Recipe">
        <h1>{recipe.title}</h1>

        <div>
          Servings:
          <button className="ServingsButton" onClick={() => handleClick(recipe.id, recipe.servings-1)}>-</button>
          {recipe.servings}
          <button className="ServingsButton" onClick={() => handleClick(recipe.id, recipe.servings+1)}>+</button>
        </div>

        <p>Ingredients:</p>
        <ul>
          {Object.entries(recipe.ingredients).map( ([ing, amount]) => {
              const ingredient = JSON.parse(ing);
              // TODO This turned into a monster. Refactor.
              return <li key={ingredient.id}>{ingredient.description}: {amount} {ingredient.measure=='UNIT'?'':ingredient.measure.toLowerCase()} </li>;
        })}
        </ul>

        <p>{recipe.directions}</p>

    </div>
}
