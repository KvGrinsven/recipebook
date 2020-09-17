import React, { useState, useEffect } from "react";
import { RecipeList } from "./RecipeList";
import { RecipePane } from "./RecipePane";
import { Recipe } from "./Recipe";

export function App() {

    const [ recipes, setRecipes ] = useState< Recipe[] | undefined>(undefined);
    const [ errorMessage, setErrorMessage ] = useState("");
    const [ selectedRecipe, setSelectedRecipe ] = useState< Recipe | undefined>(undefined);

    async function getRecipes() {
        try {
          const response = await fetch('grublub/webapi/init', {
            method: 'GET',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
          });

          if (response.ok) {
            const recipes: Recipe[] = await response.json();
            setRecipes(recipes);
          }
        } catch (error) {
            setErrorMessage(error.toString());
        }
    }

    async function deselect() {
      setSelectedRecipe(undefined);
    }

    async function select( id: number ) {
      try {
        const url = 'grublub/webapi/browse/' + id;
        const response = await fetch(url, {
          method: 'GET',
          headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
          }
        });

        if (response.ok) {
          const recipe: Recipe = await response.json();
          setSelectedRecipe(recipe);
        }
      } catch (error) {
          setErrorMessage(error.toString());
      }
    }

    async function selectWithServings( id: number, servings: number) {
      try {
        const url = 'grublub/webapi/browse/' + id + '/' + servings;
        const response = await fetch(url, {
          method: 'GET',
          headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
          }
        });

        if (response.ok) {
          const recipe: Recipe = await response.json();
          setSelectedRecipe(recipe);
        }
      } catch (error) {
          setErrorMessage(error.toString());
      }
    }

    useEffect(() => {
       getRecipes();
    }, []);

    console.log(recipes)
    // TODO Loading should be a lot faster if I don't try to get all info
    // during initialization... Only recipe titles will do for the list,
    // and then all the details for the recipe being desplayed when needed
    if(recipes) {
      return <div className="App">
        <RecipeList recipeClick={select} addClick={deselect} recipes={recipes}/>
        {selectedRecipe &&
            <RecipePane handleClick={selectWithServings} recipe={selectedRecipe}/>
        }
      </div>
    } else {
      return <div><h1>Loading...</h1></div>
    }
}
