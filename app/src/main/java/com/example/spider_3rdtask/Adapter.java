package com.example.spider_3rdtask;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Objects;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>
{
    private final List<ModelClass> userList;
    private final Context context ;

    public Adapter(List<ModelClass> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemdesign,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
ModelClass modelClass =userList.get(position);
        Picasso.get().load(modelClass.getImages().getMd()).into(holder.imageView1);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(context,MainActivity2.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                String s1= Integer.toString(userList.get(position).getId());
                i.putExtra("id",s1);
                i.putExtra("name",userList.get(position).getName());
                i.putExtra("slug",userList.get(position).getSlug());
                i.putExtra("sm",userList.get(position).getImages().getSm());

i.putExtra("intelligence",Integer.toString(userList.get(position).getPowerstats().getIntelligence()));
                i.putExtra("strength",Integer.toString(userList.get(position).getPowerstats().getStrength()));
                i.putExtra("speed",Integer.toString(userList.get(position).getPowerstats().getSpeed()));
                i.putExtra("durability",Integer.toString(userList.get(position).getPowerstats().getDurability()));
                i.putExtra("power",Integer.toString(userList.get(position).getPowerstats().getPower()));
                i.putExtra("combat",Integer.toString(userList.get(position).getPowerstats().getCombat()));

                i.putExtra("gender",userList.get(position).getAppearance().getGender());
                i.putExtra("race",userList.get(position).getAppearance().getRace());
                String[] s2 = userList.get(position).getAppearance().getHeight();
                i.putExtra("height1",s2[0]);
                i.putExtra("height2",s2[1]);
                String[] s3 = userList.get(position).getAppearance().getWeight();
                i.putExtra("weight1",s3[0]);
                i.putExtra("weight2",s3[1]);
                i.putExtra("eyeColor",userList.get(position).getAppearance().getEyeColor());
                i.putExtra("hairColor",userList.get(position).getAppearance().getHairColor());

i.putExtra("fullName",userList.get(position).getBiography().getFullName());
                i.putExtra("alterEgos",userList.get(position).getBiography().getAlterEgos());

                i.putExtra("aliases1",userList.get(position).getBiography().getAliases());
                i.putExtra("aliases2",userList.get(position).getBiography().getAliases());
                i.putExtra("aliases3",userList.get(position).getBiography().getAliases());
                i.putExtra("aliases4",userList.get(position).getBiography().getAliases());
                i.putExtra("aliases5",userList.get(position).getBiography().getAliases());
                i.putExtra("aliases6",userList.get(position).getBiography().getAliases());


                i.putExtra("placeOfBirth",userList.get(position).getBiography().getPlaceOfBirth());
                i.putExtra("firstAppearance",userList.get(position).getBiography().getFirstAppearance());
                i.putExtra("publisher",userList.get(position).getBiography().getPublisher());
                i.putExtra("alignment",userList.get(position).getBiography().getAlignment());

                i.putExtra("occupation",userList.get(position).getWork().getOccupation());
                i.putExtra("base",userList.get(position).getWork().getBase());

                i.putExtra("groupAffiliation",userList.get(position).getConnections().getGroupAffiliation());
                i.putExtra("relatives",userList.get(position).getConnections().getRelatives());


                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
private final ImageView imageView1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.imageview1);
        }
    }
}
